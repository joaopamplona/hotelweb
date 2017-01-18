package utils;
/*
 * @author RenatoMachado
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DecisorMobile extends ViewHandlerWrapper {

    private ViewHandler Wrapped;

    public DecisorMobile(ViewHandler handler) {
        this.Wrapped = handler;
    }

    @Override
    public ViewHandler getWrapped() {
        return Wrapped;
    }

    public String CalculateRendeKitId(FacesContext context) {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest hsr = (HttpServletRequest) fc.getExternalContext().getRequest();
        

        String tempreq = hsr.getHeader("User-Agent");
        String pathreq = hsr.getRequestURI();

        HttpServletResponse resp = (HttpServletResponse) fc.getExternalContext().getResponse();

        //String pathresp = resp.encodeRedirectURL("/index.xhtml");

        // pasta mobile
        if (pathreq != null && pathreq.contains("/mobile")) {
            if (tempreq != null && tempreq.contains("Mobile")) {// agente mobile
                return "PRIMEFACES_MOBILE";
            } else {// agente tradicional
                try {
                    resp.sendRedirect("/");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else {//pasta tradicional
            if (tempreq != null && tempreq.contains("Mobile")) {
                try {
                    // agente mobile
                    resp.sendRedirect("/mobile");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                return "PRIMEFACES_MOBILE";
            } else {
                return this.Wrapped.calculateRenderKitId(context);
            } /*
             *              */

        }
        return this.Wrapped.calculateRenderKitId(context);

    }
}
