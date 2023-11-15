package com.tareavaleria.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        // Estructura de mi pagina
        model.addAttribute("titulo", "Tarea Valeria Sandoval");
        model.addAttribute("subtitulo", "Tarea de Semana 10");
        model.addAttribute("contenido", "tarea webcontroller y html");

        // Devolver el nombre de la plantilla (sin la extensión .html)
        return "home";
    }
}
