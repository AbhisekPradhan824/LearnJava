class Point{
    //Reuse the code of Method Overloading - Exercise 1
    private double xCoordinate;
    private double yCoordinate;
    //Implement your code here
    public Point(double xCoordinate, double yCoordinate){
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }
    
    public double getxCoordinate(){
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public double getyCoordinate(){
        return yCoordinate;
    }
    public void setyCoordinate(double yCoordinate){
        this.yCoordinate =  yCoordinate;
    }
    
    public double calculateDistance(){
        double distance = Math.sqrt(Math.pow(xCoordinate,2) + Math.pow(yCoordinate,2));
        return Math.round(distance*100.0)/100.0;
    }
    
    public double calculateDistance(Point point){
        double distance = Math.sqrt(Math.pow((point.getxCoordinate() - xCoordinate), 2) + Math.pow((point.getyCoordinate() -yCoordinate), 2));
        return Math.round(distance*100.0)/100.0;
    }
    
    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
    
}
