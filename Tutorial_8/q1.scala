// Ceaser cipher

object Q1 extends App {
    def encryptCeaser (msg: String, shift: Int) = {
        msg.map {
            case 'z' => ('a' - 1 + shift).toChar
            case 'Z' => ('A' - 1 + shift).toChar
            case c if c.isLetter => (c + shift).toChar
            case c => c
        }
    }
    def decryptCeaser (msg: String, shift: Int) = {
        msg.map {
            case 'a' => ('z' + 1 - shift).toChar
            case 'A' => ('Z' + 1 - shift).toChar
            case c if c.isLetter => (c - shift).toChar
            case c => c
        }
    }

    var myString = "Attack Tolosa, seize survivors as slaves!";

    var encrypted = encryptCeaser(myString, 1)
    println("Encrypted msg:\n" + encrypted)

    var decrypted = decryptCeaser(encrypted, 1)
    println("Decrypted msg:\n" + decrypted)
}
