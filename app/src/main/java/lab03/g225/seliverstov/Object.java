package lab03.g225.seliverstov;

public class Object {
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
