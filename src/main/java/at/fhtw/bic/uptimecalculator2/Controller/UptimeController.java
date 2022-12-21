package at.fhtw.bic.uptimecalculator2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

import static java.awt.Color.*;

@RestController
public class UptimeController {
    @GetMapping("/uptime")
    public Color showComplementaryyColor(String color) {
        if (color.equals(red)) {
            return green;
        } else if (color.equals(green)) {
            return red;
        } else if (color.equals(orange)) {
            return blue;
        } else if (color.equals(blue)) {
            return orange;
        } else if (color.equals(yellow)) {
            return magenta;
        } else if (color.equals(magenta)) {
            return yellow;
        } else return black;
    }
}