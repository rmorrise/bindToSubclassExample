package bindtosubclassexample

class Master {
    static hasMany = [
        details: Detail
    ]

    static mapping = {
        details cascade: 'all-delete-orphan'
    }

    static constraints = {
    }
}
