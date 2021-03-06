package tp1;

import java.util.Collection;

public class Ellipse extends BaseShape {
    // TODO creer une ellipse avec une largeur et une longueur.
    public Ellipse(Double widthRadius, Double heightRadius) {
        super();

        for(double i = -heightRadius; i <= widthRadius; i += 0.5) {
            for(double j = -widthRadius; j <= heightRadius; j += 0.5){
                Double temp = ((i*i)/(widthRadius*widthRadius)) + ((j*j)/(heightRadius*heightRadius));
                if(temp <= 1.0) {
                    add(new Point2d(i, j));
                }
            }
        }
    }

    // TODO creer une ellipse avec les dimensions contenu dans un Point.
    public Ellipse(Point2d dimensions) {
        super();

        for(double i = -dimensions.X(); i <= dimensions.X(); i += 0.5) {
            for(double j = -dimensions.Y(); j <= dimensions.Y(); j += 0.5){
                Double temp = ((i*i)/(dimensions.X()*dimensions.X())) + ((j*j)/(dimensions.Y()*dimensions.Y()));
                if(temp <= 1.0) {
                    add(new Point2d(i, j));
                }
            }
        }
    }

    // TODO initialiser le parent.
    private Ellipse(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Ellipse translate(Point2d point) {
        super.translate(point);
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Ellipse rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Ellipse clone() {
        super.clone();
        return this;
    }
}
