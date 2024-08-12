// Ceaser cipher

object Q1 extends App {
    def encryptCeaser (msg: String, shift: Int) = {
        msg.map {
            case 'z' => 'a'
            case 'Z' => 'A'
            case c if c.isLetter => (c + shift).toChar
            case c => c
        }
    }
    def decryptCeaser (msg: String, shift: Int) = {
        msg.map {
            case 'a' => 'z'
            case 'A' => 'Z'
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
