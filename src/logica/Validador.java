package logica;

public class Validador {
    
    // Método estático para poder llamarlo sin instanciar la clase
    public static boolean validarRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            return false;
        }
        
        // Limpiamos la entrada de puntos y guiones
        String rutLimpio = rut.replace(".", "").replace("-", "").toUpperCase();
        
        // Un RUT sin puntos ni guión debe tener al menos 8 caracteres (ej: 1234567K)
        if (rutLimpio.length() < 8) {
            return false;
        }

        try {
            // Separar el cuerpo numérico del dígito verificador
            String cuerpo = rutLimpio.substring(0, rutLimpio.length() - 1);
            String dv = rutLimpio.substring(rutLimpio.length() - 1);
            
            int suma = 0;
            int multiplicador = 2;
            
            // Recorremos el cuerpo de derecha a izquierda
            for (int i = cuerpo.length() - 1; i >= 0; i--) {
                suma += Character.getNumericValue(cuerpo.charAt(i)) * multiplicador;
                multiplicador = (multiplicador == 7) ? 2 : multiplicador + 1;
            }
            
            // Calcular el dígito esperado
            int resto = suma % 11;
            int dvEsperado = 11 - resto;
            
            String dvCalculado;
            if (dvEsperado == 11) {
                dvCalculado = "0";
            } else if (dvEsperado == 10) {
                dvCalculado = "K";
            } else {
                dvCalculado = String.valueOf(dvEsperado);
            }
            
            // Comparar el calculado con el ingresado por el usuario
            return dvCalculado.equals(dv);
            
        } catch (NumberFormatException e) {
            // Si el cuerpo del RUT contiene letras, fallará al parsear
            return false; 
        }
    }
}