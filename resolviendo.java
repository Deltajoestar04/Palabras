package mx.itson.palabras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class resolviendo {
    public String curps(String nombre, String primerApell, String segApell, String dia, String mes, String año, String estado, String sexo){
    
        char[] apellidoP = primerApell.toCharArray();
        char[] apellidoM = segApell.toCharArray();
        char[] letrasN = nombre.toCharArray();
        char[] dias = dia.toCharArray();
        char[] Mes = mes.toCharArray();
        char[] anos = año.toCharArray();
        char fdia = (char) (dias[0]+dias[1]);
        char fmes = (char) (Mes[0]+Mes[1]);
        char faño = (char) (anos[-1]+anos[-2]);
        char primeLetraP = apellidoP[0];
        char primeLetraM = apellidoM[0];
       
        
        char vocalP = '0';
        for (int y = 1; apellidoP.length >= 0; y++) {
            if (apellidoP[y] == 'A' || apellidoP[y] == 'E' || apellidoP[y] == 'I'
                    || apellidoP[y] == 'O' || apellidoP[y] == 'U') {
                vocalP = apellidoP[y];
                break;

            }
        }
        char consonanteN = '0';
        for (int n = 1; letrasN.length >= 0; n++) {
            if (letrasN[n] == 'B' || letrasN[n] == 'C' || letrasN[n] == 'D' || letrasN[n] == 'F'
                    || letrasN[n] == 'G' || letrasN[n] == 'H' || letrasN[n] == 'J' || letrasN[n] == 'K'
                    || letrasN[n] == 'L' || letrasN[n] == 'M' || letrasN[n] == 'N' || apellidoP[n] == 'Ñ'
                    || letrasN[n] == 'P' || letrasN[n] == 'Q' || letrasN[n] == 'R' || letrasN[n] == 'S'
                    || letrasN[n] == 'T' || letrasN[n] == 'V' || letrasN[n] == 'W' || letrasN[n] == 'X'
                    || letrasN[n] == 'Y' || letrasN[n] == 'Z') {
                consonanteN = letrasN[n];
                break;
            }
        }

        char consonanteP = '0';
        for (int xd = 1; apellidoP.length >= 0; xd++) {
            if (apellidoP[xd] == 'B' || apellidoP[xd] == 'C' || apellidoP[xd] == 'D' || apellidoP[xd] == 'F'
                    || apellidoP[xd] == 'G' || apellidoP[xd] == 'H' || apellidoP[xd] == 'J' || apellidoP[xd] == 'K'
                    || apellidoP[xd] == 'L' || apellidoP[xd] == 'M' || apellidoP[xd] == 'N' || apellidoP[xd] == 'Ñ'
                    || apellidoP[xd] == 'P' || apellidoP[xd] == 'Q' || apellidoP[xd] == 'R' || apellidoP[xd] == 'S'
                    || apellidoP[xd] == 'T' || apellidoP[xd] == 'V' || apellidoP[xd] == 'W' || apellidoP[xd] == 'X'
                    || apellidoP[xd] == 'Y' || apellidoP[xd] == 'Z') {
                consonanteP = apellidoP[xd];
                break;

            }
        }
        char consonanteM = '0';
        for (int F = 1; apellidoM.length >= 0; F++) {
            if (apellidoM[F] == 'B' || apellidoM[F] == 'C' || apellidoM[F] == 'D' || apellidoM[F] == 'F'
                    || apellidoM[F] == 'G' || apellidoM[F] == 'H' || apellidoM[F] == 'J' || apellidoM[F] == 'K'
                    || apellidoM[F] == 'L' || apellidoM[F] == 'M' || apellidoM[F] == 'N' || apellidoM[F] == 'Ñ'
                    || apellidoM[F] == 'P' || apellidoM[F] == 'Q' || apellidoM[F] == 'R' || apellidoM[F] == 'S'
                    || apellidoM[F] == 'T' || apellidoM[F] == 'V' || apellidoM[F] == 'W' || apellidoM[F] == 'X'
                    || apellidoM[F] == 'Y' || apellidoM[F] == 'Z') {
                consonanteM = apellidoM[F];
                break;

            }
        }

        String sinmaterno = String.valueOf(primeLetraM);
        if (sinmaterno == "") {
            sinmaterno = "X";
        } else {

            sinmaterno = String.valueOf(primeLetraM);

        }
        int years = Integer.parseInt(año);
        String penultimo = "";
        if (years >= 2000) {
            penultimo = "A";
        } else {
            penultimo = "0";
        }
       String estadoMayus="";
       String Estado=estado;
       
        switch (Estado) { 
    case "TABASCO":
        estadoMayus = "TC";
     break;
    case "NUEVO LEÓN":
        estadoMayus = "NL";
     break;
    case "NAYARIT":
        estadoMayus = "NT";
     break;
    case "MORELOS":
        estadoMayus = "MS";
     break;
    case "MICHOACÁN":
        estadoMayus = "MN";
     break;
    case "ESTADO DE MEXICO":
        estadoMayus = "MC";
     break;
    case "JALISCO":
        estadoMayus = "JC";
     break;
    case "HIDALGO":
        estadoMayus = "HG";
     break;
    case "GUERRERO":
        estadoMayus = "GR";
     break;
    case "GUANAJUATO":
        estadoMayus = "GT";
        break;
    case "DURANGO":
        estadoMayus = "DG";
     break;
    case "DISTRITO FEDERAL":
        estadoMayus = "DF";
        break;
    case "CHIHUAHUA":
        estadoMayus = "CH";
     break;
   case "CHIAPAS":
        estadoMayus = "CS";
     break;
     case "COLIMA":
        estadoMayus = "CM";
     break;
     case "COAHUILA":
        estadoMayus = "CL";
     break;
     case "CAMPECHE":
        estadoMayus = "CC";
     break;
     case "BAJA CALIFORNIA SUR":
        estadoMayus = "BS";
     break;
     case "BAJA CALIFORNIA":
        estadoMayus = "BC";
     break;
     case "AGUASCALIENTES":
        estadoMayus = "AS";
     break;
     case "QUINTANA ROO":
        estadoMayus = "QR";
     break;
     case "QUERÉTARO":
        estadoMayus = "QT";
     break;
     case "SINALOA":
        estadoMayus = "SL";
     break;
     case "SONORA":
        estadoMayus = "SR";
     break;
     case "TAMAULIPAS":
        estadoMayus = "TS";
     break;
     case "VERACRUZ":
        estadoMayus = "VZ";
     break;
     case "YUCATÁN":
        estadoMayus = "YN";
     break;
     case "SAN LUIS POTOSÍ":
        estadoMayus = "SP";
     break;
      case "OAXACA":
        estadoMayus = "OC";
     break;
      case "PUEBLA":
        estadoMayus = "PL";
     break;
      case "ZACATECAS":
        estadoMayus = "ZS";
     break;
      case "TLAXCALA":
        estadoMayus = "TL";
     break;
      case "NACIDO EXTRANJERO":
        estadoMayus = "NE";
     break;
     
    default:
  }
        
        
        if (sexo.equals("Mujer")) {
            sexo = "H";

        } else {
            sexo = "M";
        }

        {
            
        }
 String vocal = String.valueOf(vocalP);
            String ConsonanteN = String.valueOf(consonanteN);
            String ConsonanteP = String.valueOf(consonanteP);
            String ConsonanteM = String.valueOf(consonanteM);
            String años = String.valueOf(faño);
            String meses= String.valueOf(fmes);
            String said= String.valueOf(fdia);
            String fecha=años+meses+said;
            
           String curp = primeLetraP + vocal + primeLetraM + nombre + fecha + sexo + estadoMayus + ConsonanteP 
                   + ConsonanteM + ConsonanteN + penultimo + "1";
        return curp; 
    }}
