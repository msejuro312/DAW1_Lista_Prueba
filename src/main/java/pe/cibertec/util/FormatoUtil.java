package pe.cibertec.util;

import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class FormatoUtil {

    //función de utilitario para poner la primer letra en mayúscula y todo lo demás en minúscula
    public String capitalizar(String texto)
    {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase()+ texto.substring(1).toLowerCase();
    }
}


