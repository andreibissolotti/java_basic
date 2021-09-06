public class Tipos {
 public static void main(String[] args) {

     // PRIMITIVOS

     // inteiros
     // Não aceitam nulos

     byte b;        // 8 Bits no máximo [-128,127]

     char c;        // 16 bites (alphanumericos, 1 digito)

     short s;       // 16 bites (apenas numeros [-32768, 32767])

     int i;         // 32 bits (apenas números [-2147483648, 2147483647])

     long l;        // 64 bites (apenas números [-9223372036854775808L, 9223372036854775807L])

     // FLUTUANTES
     // Numeros não inteiros

     float f = 65.5f;// 32 bits (Precisa do 'f' no fim)

     double d = 1024.99; // 64 bits

     // BOLEANO
     // (false, true)

     // WRAPPERS -> são objetos
     // Seguem as mesmas regras dos primitivos mas aceitam null
     // Podem passar seus valores à um primitivo (unboxing)
     // byte    -> Byte
     // char    -> Character
     // short   -> Short
     // int     -> Integer
     // float   -> Float
     // double  -> Double
     // boolean -> Boolean


     // NÃO PRIMITIVOS 

     // String
     // Number
     // Object
     // Qualquer outros objetos
 }   
}
