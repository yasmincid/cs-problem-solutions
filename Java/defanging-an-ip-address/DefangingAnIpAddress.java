public String defrangIPaddr(String address) {
        String cadena;
        String parts[] = new String[3];
        parts = address.split("\\.");
        cadena = parts[0] + "[.]" + parts[1] + "[.]" + parts[2] + "[.]" + parts[3];

        return cadena;
    }