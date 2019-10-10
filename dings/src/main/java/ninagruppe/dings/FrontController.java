package ninagruppe.dings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front")
public class FrontController
{
    @GetMapping
    public String getFrontForm(Model model)
    {
        return "front";
    }

    @GetMapping("/{name}")
    public String begruessungUndGetFrontForm(Model model,
            @PathVariable String name)
    {

        model.addAttribute(name);
        return "front";
    }

    @PostMapping
    public String eintraegeAnsehen()
    {
        return "hello";
    }

}