
public class FechaYHora
{
    private NumberDisplay minuto;
    private NumberDisplay hora;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anio;
    
    public FechaYHora()
    {
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anio = new DisplayDosDigitos(100);
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
    }
    
    public String getFechaYHora()
    {
        return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + anio.getValorDelDisplay() + " " + hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }
    
    public void avanzar()
    {
        minuto.increment();
        if(minuto.getValue() == 0){
            hora.increment();
            if(hora.getValue() == 0){
                dia.incrementaValor();
                if(dia.getValor() == 1){
                    mes.incrementaValor();
                    if(mes.getValor() == 1){
                        anio.incrementaValor();
                    }
                }
            }
        }
    }
    
    public void fijarFechaYHora(int nuevoDia, int nuevoMes, int nuevoAnio, int nuevaHora, int nuevoMinuto)
    {
        if((nuevoDia > 0 && nuevoDia < 31) && (nuevoMes > 0 && nuevoMes < 13) && (nuevoAnio > 0 && nuevoAnio < 100) && (nuevaHora >= 0 && nuevaHora < 24) && (nuevoMinuto >= 0 && nuevoMinuto < 60))
        {
           dia.setValor(nuevoDia);
           mes.setValor(nuevoMes);
           anio.setValor(nuevoAnio);
           hora.setValue(nuevaHora);
           minuto.setValue(nuevoMinuto);
        }
        else{
            System.out.println("Hora o Fecha incorrecta, introduzca los valores de nuevo");
        }
    }
    
    
                
        

    
    
    
}