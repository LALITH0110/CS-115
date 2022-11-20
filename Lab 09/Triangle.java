public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    public Triangle(){
        setP1(new Point());
        setP2(new Point());
        setP3(new Point());
    }
    public Triangle(Point pointGiven1, Point pointGiven2, Point pointGiven3){
        setP1(pointGiven1);
        setP2(pointGiven2);
        setP3(pointGiven3);
    }
    public void setP1 (Point newp1){
        if (newp1 != null){
            p1 = newp1;
            p1= new Point(newp1.getX(), newp1.getY());
        }
        else {
            p1 = new Point();
        }
    }

    public void setP2 (Point newp2){
        if(newp2 != null) {
            p2 = newp2;
            p2= new Point(newp2.getX(), newp2.getY());
        }
        else {
            p2 = new Point();
        }
    }

    public void setP3 (Point newp3){

        if (newp3 != null) {
            p3 = newp3;
            p3= new Point(newp3.getX(), newp3.getY());

        }
        else {
            p3 = new Point();
        }
    }
    public Point getP1(Point newP1){
        return new Point(this.p1);
    }

    public Point getP2(){
        return new Point(this.p2);
    }

    public Point getP3(){
        return new Point(this.p3);
    }

    public boolean isTriangle() {

        double slope1, slope2;
        if (p2.getX()-p1.getX() == 0) {
            slope1=Double.MAX_VALUE;
        }

        else {
            slope1=(p2.getY()-p1.getY()) / (p2.getX()-p1.getX());
        }

        if (p3.getX()-p1.getX() == 0) {
            slope2=Double.MAX_VALUE;
        }

        else {
            slope2=(p3.getY()-p1.getY()) / (p3.getX()-p1.getX());
        }
        if (slope1 == slope2) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean isRightTriangle() {

        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);
        if (a > b && a > c) {

            if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a,2)) {
                return true;

            } else {
                return false;
            }
        }
        else if (b > a && b > c) {
            if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b,2)){
                return true;
            }
            else {
                return false;
            }
        }
        else if (c > a && c > b) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public String toString(){

        return  p1.toString() + " "+ p2.toString() + " " + p3.toString();
    }

}