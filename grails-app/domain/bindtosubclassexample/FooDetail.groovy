package bindtosubclassexample

class FooDetail extends Detail {
    String fooProperty

    static constraints = {
    }

    static mapping = {
        discriminator column: 'DETAIL_TYPE', value: 'FOO'
    }
}
