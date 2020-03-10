public String dayOfTheWeek(int day, int month, int year) {
        String dia = "hola";
        Calendar c = new GregorianCalendar();
        c.set(year, month - 1, day);
        int cont = c.get(Calendar.DAY_OF_WEEK);
        switch (cont) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miercoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sabado";
                break;
        }
        return dia;
    }