public abstract class  CentroAbstracto implements PuntoAbstracto {
    private double x;
    private double y;

public CentroAbstracto(double x, double y){
    super(x,y);
}


    /*
    SETS Y GETS
    */
    public void setX(double x){
        if(x >= 0 ) this.x = x;
        else x = 0;
    }//end setX

    public double getX (){
        return x;
    }//end getX

    public void setY(double y){
        if(y >= 0 ) this.y = y;
        else y = 0;
    }//end setY

    public double getY (){
        return y;
    }//end getY


}//end class