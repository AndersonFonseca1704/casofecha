package modelo;

public class Fecha
{
    //------------------
    //ATRIIBUTOS
    //------------------
    private int dia ;
    private int mes = 0;
    private int anio;

    //------------------
    //METODOS
    //------------------

    //metodo acceso

    //metodos SET
    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    } 

    //metodos get

    public int getAnio() 
    {
        return anio;
    }

    public int getDia() 
    {
        return dia;
    }

    public int getMes() 
    {
        return mes;
    }

    //metodo sobreescrito de la clase Object
    public String toString()
    {
        return dia + "/" + mes + "/" + anio ; 
    }

    //metodo sobreescrito de la clase Object
    public boolean equals(Object obj)
    {
        Fecha otra = (Fecha)obj;
        return(dia==otra.dia)&& (mes==otra.mes)&&(anio==otra.anio);
    }

    //------------------
    //Metodo addDias
    //-------------------
    public void addDias(int d)
    {
      int sum = fechaToDias() + d;
      diastofecha(sum);
    }   
    //-------------------
    //metodo fecha
    //-------------------
    private int fechaToDias()
    {
        return anio*360 + mes*30 + dia;
    }
    //-------------------
    //metodo inverso
    //------------------

    private void diastofecha(int i)
    {

    //dividimos e 360 para obtener el año
    anio=(int)i/360;


    //con el residuo obtenemmos el mes dia
    int resto = i%360;


    // para hallar el mes se divide entre 30
    mes=(int)resto/30;


    //el resto de la divison anterior son los dias 
    dia= resto%30;

    if (dia == 0)
    {
        dia = 30;
        mes--;
    }
    
    if(mes == 0)
    {
        mes = 12;
        anio--;
    }
    
    }

    
}
