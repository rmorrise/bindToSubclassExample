package bindtosubclassexample

class BarDetail extends Detail {
    String barProperty

    static constraints = {
    }

    static mapping = {
        discriminator column: 'DETAIL_TYPE', value: 'BAR'
    }
}
