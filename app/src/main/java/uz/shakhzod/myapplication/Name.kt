package uz.shakhzod.myapplication

class Name {
    var id: Int = 0
    var userName: String? = null
    constructor(id: Int, userName: String) {
        this.id = id
        this.userName = userName
    }
    constructor(userName: String) {
        this.userName = userName
    }
}