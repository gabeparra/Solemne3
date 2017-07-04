package controller;

import entity.Menu;
import entity.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.MenuModel;
import model.UsuarioModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home.htm")
public class AddUsuarioController {

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("usuario") Usuario u,
            BindingResult result, SessionStatus status, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String user = request.getParameter("nombreUsuario");
        String pass = request.getParameter("password");
        String nombre = request.getParameter("password");
        String apellido = request.getParameter("password");
        Usuario usuario = new Usuario(user, pass);
        UsuarioModel objUsuarioModel = new UsuarioModel();
        Usuario objUsuario = objUsuarioModel.validaUsuario(user, pass);
        if (objUsuario != null) {
            mv.addObject("usuario", objUsuario);
            int id = objUsuario.getPerfil().getIdPerfil();
            MenuModel menuModel = new MenuModel();
            List<Menu> listado = menuModel.getMenuXPerfil(id);
            mv.addObject("listadoMenu", listado);
            mv.setViewName("home");
            return mv;
        } else {
            mv.addObject("usuario", usuario);
            return new ModelAndView("redirect:/login.htm");
        }
    }
}