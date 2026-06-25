package Suchen;

public class Main {

    //die SuchMethode
    //Frage - WIE wollen wir suchen?
    //wir suchen über das ganze array ---> sogenannte Lineare Suche
    //Rückgabewert soll auswertbar sein - ob gefunden oder nicht
    public static int lineareSuche(String[] array, String suchString) {
        //die Logik - WAS geben wir zurück?
        //bei Fund ein
        //bei nicht gefunden -1
        //wie oft muss den verglichen werden? wie performant ist mein Algorithmus
        int vergleiche = 0;

        for (int i = 0; i < array.length; i++) {

            vergleiche++;

            if (suchString.equals(array[i])) {
                System.out.println("Der Name wurde nach " + vergleiche + " Vergleichen gefunden");
                return 0;
            } else {
                // return nach FOR schleife
            }
        }
        System.out.println("Nach " + vergleiche + " Vergleichen ist das Array durchsucht - wir waren erfolglos");
        return -1;
    }

    public static int binaereSuche(String[] array, String suchString) {

        //was sagt und der Name? aus binär könnte man "zwei" ableiten
        //genau das ist richtig - wir teilen die Suchmenge
        //wie teilen wir?
        //wir suchen brauchen die Mitten, d.h das mittlere Element
        //1. Aufgabe - die Mitte ermitteln
        //wir haben die Länge mit array.length und das wird durch 2 dividiert
        int vergleiche = 0;
        int mittleresElement;
        int links, rechts;

        //wir halbieren immer wieder
        //wie lange denn?
        //solange bis die halbierte Menge nicht mehr teilbar ist
        //Trick - wie erkennt man das? wir definieren eine
        //linke und eine rechten Grenze im Array

        links = 0;
        rechts = array.length -1;

        //hier beginnt die Wiederholung des Halbierens.
        do {
            mittleresElement = (links + rechts)/2;
            if (array[mittleresElement].equals(suchString)) {
                //Wort wurde gefunden - wir sind gertig
                return 0;
            }
            //wir vergleichen nun den gesuchten Namen mit dem mittleren Element auf grösser oder kleiner
            else if (array[mittleresElement].compareTo(suchString) < 0) {
                //hier sind wir wenn der gesuchte Name grösser ist als der mittlere Name
                links = mittleresElement;
            } else {
                //hier sind wir wenn der gesuchte Name kleiner ist als der mittlere Name
                rechts = mittleresElement;
            }
        }while(true);
    }

    public static void main(String[] args) {

        //Suchen - für Anwendungsentwickler ein algorithmisches Problem - also auf jeden Fall interessant
        //Und die Systemintegratoren?? --> Bei der Nutzung von Datenbanken ist das Thema Suchen relevant
        //erster Ansatz zum Suchen - wir brauchen erstmal Daten

        /**String[] namen = {
                "Anton", "Berta", "Caesar", "Dora", "Emil",
                "Friedrich", "Gustav", "Heinrich", "Ida", "Julius"
        };
         */
        String[] namen = {
                "Abel", "Ahrens", "Albert", "Albrecht", "Altbach", "Altberg", "Altburg", "Altdorf",
                "Alter", "Altheim", "Altmann", "Altstein", "Altthal", "Altwald", "Amann", "Arnold",
                "Auer", "Bachmann", "Bader", "Bahr", "Baier", "Baron", "Bartels", "Barth",
                "Bastian", "Bauer", "Baum", "Baumann", "Baumgartner", "Baur", "Bechmann", "Beck",
                "Becker", "Beckers", "Behnke", "Beier", "Benda", "Bender", "Benz", "Berger",
                "Berndt", "Bernhardt", "Bertram", "Betz", "Beyer", "Bieber", "Biedermann", "Binder",
                "Birkenbach", "Birkenberg", "Birkenburg", "Birkendorf", "Birkener", "Birkenheim", "Birkenmann", "Birkenstein",
                "Birkenthal", "Birkenwald", "Bischof", "Bischoff", "Bitter", "Blank", "Blau", "Blechschmidt",
                "Blum", "Blume", "Bock", "Bode", "Bohn", "Bohnsack", "Bollmann", "Borchert",
                "Bormann", "Born", "Borsch", "Bosse", "Braband", "Brandt", "Braun", "Breitbach",
                "Breitberg", "Breitburg", "Breitdorf", "Breiter", "Breitheim", "Breitmann", "Breitstein", "Breitthal",
                "Breitwald", "Bremer", "Brenner", "Breuer", "Brinkmann", "Brosch", "Brucker", "Brunner",
                "Bruns", "Brückner", "Brüggemann", "Buchholz", "Buchner", "Burkhardt", "Busch", "Busse",
                "Bühler", "Bührle", "Christ", "Conrad", "Cordes", "Cremer", "Dahl", "Damm",
                "Daniel", "Decker", "Degen", "Dehn", "Demmer", "Denz", "Derrick", "Dettmer",
                "Diehl", "Diel", "Dierks", "Dietrich", "Dietz", "Dietze", "Dill", "Dinter",
                "Dippel", "Dittmann", "Dittrich", "Doll", "Dombrowski", "Domke", "Dorn", "Dost",
                "Drees", "Dreher", "Drescher", "Drews", "Dreyer", "Droste", "Döring", "Dörr",
                "Düwel", "Ebel", "Ebeling", "Eberhard", "Eberhardt", "Eberle", "Ebert", "Eckard",
                "Eckhardt", "Eckstein", "Eggers", "Eggert", "Ehlers", "Ehrhardt", "Ehrle", "Ehrlich",
                "Eichbach", "Eichberg", "Eichburg", "Eichdorf", "Eicher", "Eichheim", "Eichhorn", "Eichler",
                "Eichmann", "Eichstein", "Eichthal", "Eichwald", "Eiler", "Eilers", "Eisenmann", "Eisner",
                "Elser", "Ender", "Enders", "Engel", "Engelhardt", "Engelmann", "Engels", "Engler",
                "Erdmann", "Erler", "Ernst", "Ertl", "Esch", "Eschenbach", "Esser", "Evers",
                "Ewald", "Faas", "Faber", "Fabian", "Faehrmann", "Falk", "Falke", "Fast",
                "Fechner", "Fehr", "Feige", "Feil", "Feist", "Feldmann", "Fels", "Fenske",
                "Fenzl", "Ferber", "Fett", "Fetter", "Feuerbach", "Fey", "Fichtner", "Fick",
                "Fiebig", "Fiedler", "Figge", "Finger", "Fink", "Finke", "Fintel", "Fisch",
                "Fischer", "Fitschen", "Flach", "Flamme", "Fleck", "Fleischer", "Fleischmann", "Flemming",
                "Flick", "Flügel", "Focke", "Forster", "Franck", "Frank", "Franke", "Franz",
                "Franzen", "Freese", "Frei", "Freiberg", "Freitag", "Frenzel", "Freudenberg", "Freund",
                "Frey", "Freytag", "Fricke", "Friedl", "Friedrich", "Friedrichs", "Frisch", "Fritsch",
                "Fritsche", "Fritz", "Fritze", "Fritzsche", "Frohberg", "Fromm", "Fromme", "Frosch",
                "Fröhlich", "Früh", "Fuchs", "Fugger", "Fuhl", "Fuhrmann", "Funk", "Funke",
                "Futter", "Förster", "Förstner", "Fürst", "Gabel", "Gabler", "Gabriel", "Gaertner",
                "Galle", "Ganser", "Ganz", "Gartmann", "Gass", "Gasser", "Gassner", "Gast",
                "Gatz", "Gau", "Gauer", "Gaul", "Gebauer", "Gebel", "Gebhardt", "Gehrig",
                "Gehring", "Gehrke", "Geier", "Geiger", "Geis", "Geisler", "Geissler", "Gellert",
                "Geng", "Gensch", "Genske", "George", "Gerber", "Gerdes", "Gerhard", "Gerhardt",
                "Gerlach", "Gerling", "Germann", "Gerner", "Gerold", "Gerst", "Gerster", "Gerstner",
                "Geyer", "Gieb", "Giebel", "Gier", "Giese", "Gieseke", "Gieseler", "Glaser",
                "Glatz", "Glaub", "Gleich", "Gleissner", "Glock", "Gloeckner", "Gloger", "Gluth",
                "Gläser", "Glöckner", "Gnad", "Goebel", "Goecke", "Goerke", "Goertz", "Goethe",
                "Gogel", "Gohl", "Goll", "Goller", "Gollnick", "Gommel", "Gort", "Gothe",
                "Gottfried", "Gottschalk", "Gottschlich", "Gottwald", "Grabner", "Grabow", "Gradl", "Graf",
                "Grafe", "Graff", "Grah", "Grahn", "Gramlich", "Grams", "Grass", "Grasser",
                "Grassl", "Grau", "Grauel", "Graumann", "Graunke", "Greb", "Grebe", "Greger",
                "Greif", "Greiner", "Grell", "Greve", "Grieb", "Griebel", "Gries", "Griese",
                "Grieser", "Grill", "Grimm", "Grimme", "Grisch", "Groene", "Groh", "Grohe",
                "Gronau", "Grosch", "Gross", "Grosse", "Grosser", "Grossmann", "Groth", "Grothe",
                "Groß", "Großbach", "Großberg", "Großburg", "Großdorf", "Große", "Großer", "Großheim",
                "Großmann", "Großstein", "Großthal", "Großwald", "Grube", "Gruber", "Gruhn", "Grumbach",
                "Grund", "Grundmann", "Grunwald", "Gruschke", "Gräf", "Gräfe", "Grüger", "Grün",
                "Grünbach", "Grünberg", "Grünburg", "Gründel", "Gründorf", "Grüner", "Grünewald", "Grünheim",
                "Grüning", "Grünkorn", "Grünmann", "Grünstein", "Grünthal", "Grünwald", "Guba", "Guck",
                "Guder", "Guhl", "Gulde", "Gumm", "Gundlach", "Gunkel", "Gusch", "Guse",
                "Guss", "Guth", "Gutjahr", "Gutmann", "Gutsche", "Gärtner", "Göbel", "Göepfert",
                "Göhler", "Göldner", "Gölz", "Göpfert", "Görlich", "Görner", "Götz", "Götze",
                "Günter", "Günther", "Gürtler", "Haack", "Haaf", "Haag", "Haak", "Haas",
                "Haase", "Habedank", "Habel", "Haber", "Haberl", "Haberland", "Habermann", "Habicht",
                "Hach", "Hache", "Hack", "Hacke", "Hader", "Hadlich", "Haefner", "Hael",
                "Haenel", "Haerle", "Hafner", "Hagedorn", "Hagel", "Hagemann", "Hagen", "Hagener",
                "Hager", "Hahl", "Hahn", "Hahne", "Hahnemann", "Haider", "Haimerl", "Hain",
                "Hajek", "Halbe", "Hall", "Haller", "Hallmann", "Hamann", "Hamel", "Hamm",
                "Hammer", "Hammerschmidt", "Hampel", "Hanf", "Hanisch", "Hanke", "Hann", "Hanna",
                "Hannemann", "Hannes", "Hannig", "Hans", "Hanse", "Hansen", "Hansmann", "Hanson",
                "Hantke", "Hantzsch", "Happe", "Harling", "Harms", "Harnisch", "Harr", "Harrer",
                "Harsch", "Hart", "Harte", "Harten", "Harter", "Hartert", "Hartig", "Hartl",
                "Hartleib", "Hartlieb", "Hartmann", "Hartung", "Hartwig", "Hartz", "Harz", "Hasch",
                "Hase", "Hasel", "Hasen", "Haspel", "Hass", "Hasse", "Hassel", "Hassler",
                "Hat", "Hau", "Haub", "Haube", "Haubner", "Haubold", "Hauck", "Haueisen",
                "Hauer", "Hauf", "Haufe", "Hauff", "Haug", "Hauk", "Haupt", "Hauptmann",
                "Haus", "Hausch", "Hauser", "Hausmann", "Hausser", "Haussmann", "Havel", "Havemann",
                "Hebe", "Hebel", "Hebenstreit", "Heber", "Hechler", "Hecht", "Heck", "Hecke",
                "Heckel", "Hecker", "Heckmann", "Hedrich", "Heeg", "Heer", "Heeren", "Heesch",
                "Heft", "Hegel", "Hegemann", "Heger", "Hehl", "Hehn", "Hehr", "Heib",
                "Heid", "Heida", "Heide", "Heidel", "Heidemann", "Heiden", "Heider", "Heidrich",
                "Heidt", "Heil", "Heiland", "Heilig", "Heilmann", "Heim", "Heiman", "Heimann",
                "Heimbach", "Heimerl", "Heimes", "Hein", "Heine", "Heinecke", "Heineking", "Heinemann",
                "Heinen", "Heiner", "Heinig", "Heininger", "Heinitz", "Heinke", "Heinrich", "Heinrichs",
                "Heins", "Heintz", "Heinz", "Heinze", "Heinzel", "Heinzelmann", "Heinzmann", "Heise",
                "Heiser", "Heisig", "Heiss", "Heister", "Heit", "Heiter", "Heitmann", "Heitz",
                "Helbig", "Held", "Heldt", "Helfrich", "Hell", "Helle", "Heller", "Hellmann",
                "Hellmich", "Hellmuth", "Hellwig", "Helm", "Helmbold", "Helmer", "Helmke", "Helms",
                "Hemme", "Hemmel", "Hemmer", "Hemmerling", "Hempel", "Hendrich", "Henk", "Henke",
                "Henkel", "Henn", "Henne", "Hennecke", "Hennig", "Henning", "Hennings", "Henrich",
                "Henrichs", "Henry", "Henschel", "Hense", "Hensel", "Henseleit", "Hensen", "Hensinger",
                "Hentschel", "Henz", "Henze", "Hepp", "Hepper", "Heppner", "Herber", "Herberg",
                "Herbert", "Herbig", "Herbold", "Herbst", "Herde", "Herden", "Herder", "Herdt",
                "Herfurth", "Hering", "Herk", "Herklotz", "Herlt", "Herman", "Hermann", "Hermes",
                "Herold", "Herpel", "Herr", "Herren", "Herrlich", "Herrmann", "Herrn", "Hertel",
                "Herter", "Hertlein", "Hertwig", "Hertz", "Herv", "Herweg", "Herwig", "Herz",
                "Herzer", "Herzger", "Herzog", "Hess", "Hesse", "Hessel", "Hessler", "Hester",
                "Hett", "Hettich", "Hetz", "Hetzel", "Heub", "Heublein", "Heuer", "Heuk",
                "Heumann", "Heun", "Heusch", "Heuser", "Heuss", "Hey", "Heyde", "Heyden",
                "Heyder", "Heyer", "Heyann", "Heyn", "Heyne", "Hick", "Hid", "Hieber",
                "Hielscher", "Hiemer", "Hier", "Hild", "Hildebrand", "Hildebrandt", "Hildenbrand", "Hildner",
                "Hilger", "Hilgers", "Hill", "Hille", "Hillebrand", "Hillen", "Hillenbrand", "Hiller",
                "Hillmann", "Hilmer", "Hilpert", "Hilt", "Himmel", "Himmelsbach", "Hink", "Hinkel",
                "Hinkelmann", "Hinrichs", "Hinsch", "Hinter", "Hintz", "Hintze", "Hinz", "Hinze",
                "Hipp", "Hippe", "Hippler", "Hirsch", "Hirschberger", "Hirschfeld", "Hirschmann", "Hirt",
                "Hirte", "Hitz", "Hitzel", "Hitzer", "Hob", "Hobe", "Hoch", "Hochmuth",
                "Hock", "Hocke", "Hod", "Hode", "Hoef", "Hoefler", "Hoeft", "Hoehl",
                "Hoehn", "Hoehne", "Hoek", "Hoel", "Hoelscher", "Hoelzel", "Hoelzer", "Hoepfner",
                "Hoeppner", "Hoer", "Hoering", "Hoerl", "Hoermann", "Hoern", "Hoes", "Hof",
                "Hofbauer", "Hofer", "Hoff", "Hoffmann", "Hoffmeister", "Hofman", "Hofmann", "Hofmeister",
                "Hofstetter", "Hoge", "Hoh", "Hohle", "Hohmann", "Hohn", "Hold", "Holder",
                "Holl", "Holle", "Hollmann", "Hollstein", "Holm", "Holscher", "Holst", "Holstein",
                "Holt", "Holte", "Holtermann", "Holtfreter", "Holth", "Holthusen", "Holtz", "Holtzhauer",
                "Holz", "Holzapfel", "Holzer", "Holzhauer", "Holzmann", "Holzwarth", "Homann", "Hommel",
                "Hone", "Honecker", "Hopf", "Hopfner", "Hopp", "Hoppe", "Horch", "Horn",
                "Horndasch", "Hornig", "Hornung", "Horst", "Horstmann", "Hort", "Hose", "Hosemann",
                "Hoss", "Hott", "Hotz", "Houben", "Hoyer", "Hub", "Hube", "Huber",
                "Hubert", "Huck", "Hucke", "Huckenbeck", "Huder", "Hueb", "Hueber", "Huebner",
                "Huefner", "Hugel", "Huhn", "Hummel", "Hummels", "Hund", "Hundt", "Hune",
                "Hupf", "Hupfer", "Hupp", "Huppe", "Huss", "Huth", "Hutschenreuther", "Hutter",
                "Häkl", "Händler", "Hänel", "Härle", "Härtel", "Häusler", "Höfer", "Höfner",
                "Höger", "Höhle", "Höhn", "Höhne", "Hölscher", "Hölzer", "Höpfl", "Höpfner",
                "Höppner", "Hörl", "Hörmann", "Hörner", "Hübel", "Hübner", "Hügel", "Hühn",
                "Hülsmann", "Hürter", "Hütter", "Kaiser", "Kaltbach", "Kaltberg", "Kaltburg", "Kaltdorf",
                "Kalter", "Kaltheim", "Kaltmann", "Kaltstein", "Kaltthal", "Kaltwald", "Karg", "Kaufmann",
                "Keller", "Kiefer", "Kirchner", "Klaus", "Klein", "Kleinbach", "Kleinberg", "Kleinburg",
                "Kleindorf", "Kleiner", "Kleinheim", "Kleinmann", "Kleinstein", "Kleinthal", "Kleinwald", "Klose",
                "Kng", "Knipp", "Knobloch", "Knoll", "Knorr", "Knuth", "Koch", "Kohl",
                "Kopp", "Kramer", "Kraus", "Krause", "Krawczyk", "Krebs", "Kremer", "Kretschmer"
        };
        //Variablen
        String gesuchterName = "Alter";
        int suchErgebnis;

        System.out.println("Wir haben nun " + namen.length + " zur Verfügung");

        //Wir wollen hier einen Namen suchen - als Bsp. nehmen wir "Ida"
        //wir müssen mehrere Vergleiche durchführen --- for scheife als idee (anzahl durchläufe ist bekkant)
        //Vergleich (weil String) mit equals (String Comparison)
        //wir "machen" das in einer Methode
        //Auswertung mit if else - bei -1 nicht gefunden
        suchErgebnis = lineareSuche(namen, gesuchterName);
        //ein anderer Algorithmus nennt sich binäre Suche

        if(suchErgebnis == -1){
            System.out.println("Der Name Wurde nicht gefunden!");
        }else{
            System.out.println("Der Name wurde gefunden");
        }

    }
}
