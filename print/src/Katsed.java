public class Katsed {
    public static void main(String[] args) {
        Tund kolmasTund = new Tund();
        
        kolmasTund.tund = "3";
        kolmasTund.algus = "11:55";
        kolmasTund.lopp = "14:00";
        kolmasTund.aine = "JAVA";
        kolmasTund.grupp = "VS18";
        kolmasTund.opetaja = "Anna";
        kolmasTund.ruum = "418\n\n";

        Tund neljasTund = new Tund();

        neljasTund.tund = "4";
        neljasTund.algus = "11:55";
        neljasTund.lopp = "14:00";
        neljasTund.aine = "JAVA";
        neljasTund.grupp = "VS18";
        neljasTund.opetaja = "Anna";
        neljasTund.ruum = "418\n\n";

        Tund viiesTund = new Tund();

        viiesTund.tund = "5";
        viiesTund.algus = "11:55";
        viiesTund.lopp = "14:00";
        viiesTund.aine = "JAVA";
        viiesTund.grupp = "VS18";
        viiesTund.opetaja = "Anna";
        viiesTund.ruum = "418\n\n";

        Paev esmaspaev = new Paev();
        esmaspaev.kuupaev = "2019-11-18";
        esmaspaev.tundideNimekiri.add(kolmasTund);

    }
}
