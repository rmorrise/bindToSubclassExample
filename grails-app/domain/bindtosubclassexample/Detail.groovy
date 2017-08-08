package bindtosubclassexample

class Detail {
    static belongsTo = [master: Master]
    String detailType

    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
        discriminator column: 'DETAIL_TYPE'
    }
}
