import java.util.Collection;

class Bar {
    public static final Foo[] foos();
}

class Foo {

    {
        Collection<Foo> f = Bar.<caret>
    }

}
