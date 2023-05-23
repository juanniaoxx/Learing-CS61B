import net.sf.saxon.trans.SymbolicName;

public class Foo {
    public int x , y ;

    public Foo (int x , int y){
        this.x = x;
        this.y = y;
    }
    public static void switcheroo (Foo a , Foo b){
        Foo temp = a;
        a = b;
        b = temp;
    }
    public static void fliperoo (Foo a , Foo b){
        Foo temp = new Foo(a.x , a. y);
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }
    public static void swaperoo (Foo a , Foo b){
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }
    public static void main(String[] args){
        Foo foobar = new Foo(10,20);
        Foo baz = new Foo(30,40);
        switcheroo(foobar,baz);
        System.out.println("foobar x is " + foobar.x + " and it's y " + foobar.y );
        System.out.println("baz x is " + baz.x + " and it's y " + baz.y);
        fliperoo(foobar,baz);
        System.out.println("foobar x is " + foobar.x + " and it's y " + foobar.y );
        System.out.println("baz x is " + baz.x + " and it's y " + baz.y);
        swaperoo(foobar,baz);
        System.out.println("foobar x is " + foobar.x + " and it's y " + foobar.y );
        System.out.println("baz x is " + baz.x + " and it's y " + baz.y);
    }
}
/*Question
* 32:foobar.x:_30__foobar.y:__40_ baz.x:__10__ baz.y__20__ (x)
* 33:foobar.x:_10__foobar.y:__20_ baz.x:__30__ baz.y__40__(x)
* 34:foobar.x:___foobar.y:___ baz.x:____ baz.y____(x)
* */

/*Answer
*1.
*2.
*3.
* */


