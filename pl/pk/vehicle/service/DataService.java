package pl.pk.vehicle.service;

public class DataService {

    public static String getDataAsText() {
        String text =
                "Kia;2004;188929;25506.00\n" +
                "Kia;2015;29735;85932.00\n" +
                "Nissan;2017;1822;94834.00\n" +
                "Volvo;2012;52488;66343.00\n" +
                "Kia;2005;152346;32375.00\n" +
                "Ford;2016;20648;89968.00\n" +
                "Nissan;2016;18283;92721.00\n" +
                "Skoda;2004;146984;25291.00\n" +
                "Seat;2000;176472;3479.00\n" +
                "Opel;2007;148649;38595.00\n" +
                "Mazda;2002;144791;12535.00\n" +
                "Audi;2011;45287;63748.00\n" +
                "Nissan;2014;32491;78964.00\n" +
                "Skoda;2011;71128;63822.00\n" +
                "Ford;2015;36916;85234.00\n" +
                "Peugeot;2002;196769;15985.00\n" +
                "Ford;2014;46777;77089.00\n" +
                "Audi;2017;862;98511.00\n" +
                "Ford;2001;148858;8294.00\n" +
                "Ford;2002;182825;11959.00\n" +
                "Ford;2006;144054;33545.00\n" +
                "Kia;2003;187557;17647.00\n" +
                "Volvo;2006;82674;35680.00\n" +
                "Nissan;2009;64464;52630.00\n" +
                "Peugeot;2016;18761;90242.00\n" +
                "Ford;2000;147185;734.00\n" +
                "Ford;2005;164960;28051.00\n" +
                "Volvo;2009;86801;50142.00\n" +
                "Ford;2010;72065;60300.00\n" +
                "Skoda;2012;82845;69015.00\n" +
                "Nissan;2001;229948;10556.00\n" +
                "Peugeot;2017;7120;96976.00\n" +
                "Peugeot;2013;55835;74287.00\n" +
                "Mazda;2013;33558;73138.00\n" +
                "Peugeot;2006;133248;36812.00\n" +
                "Opel;2011;57082;62044.00\n" +
                "Audi;2017;8769;97173.00\n" +
                "Nissan;2016;26098;88758.00\n" +
                "Peugeot;2000;128842;3547.00\n" +
                "Ford;2003;210849;20022.00\n" +
                "Ford;2009;78078;54127.00\n" +
                "Fiat;2003;140472;21646.00\n" +
                "Kia;2002;167289;13713.00\n" +
                "Ford;2015;28844;83563.00\n" +
                "Kia;2007;146405;41910.00\n" +
                "Fiat;2012;53449;69954.00\n" +
                "Volvo;2014;46250;77289.00\n" +
                "Skoda;2001;125420;6441.00\n" +
                "Kia;2014;35114;77896.00\n" +
                "Audi;2016;19303;92309.00\n" +
                "Volvo;2009;98411;52675.00\n" +
                "Kia;2006;158970;33953.00\n" +
                "Fiat;2017;4351;96246.00\n" +
                "Kia;2004;152257;22872.00\n" +
                "Seat;2000;172821;5285.00\n" +
                "Audi;2006;87976;37913.00\n" +
                "Peugeot;2004;161265;27276.00\n" +
                "Volvo;2004;179632;25571.00\n" +
                "Seat;2004;131439;26235.00\n" +
                "Nissan;2005;165403;31033.00\n" +
                "Skoda;2000;243305;3664.00\n" +
                "Ford;2000;167099;428.00\n" +
                "Nissan;2016;17460;88348.00\n" +
                "Audi;2012;74894;67040.00\n" +
                "Audi;2001;152378;10276.00\n" +
                "Volvo;2003;123463;18761.00\n" +
                "Mazda;2015;22465;86396.00\n" +
                "Peugeot;2003;163303;18304.00\n" +
                "Ford;2010;102005;55132.00\n" +
                "Volvo;2009;64884;50147.00\n" +
                "Ford;2006;125658;36717.00\n" +
                "Kia;2016;18159;91248.00\n" +
                "Seat;2013;48199;74895.00\n" +
                "Seat;2001;234095;6420.00\n" +
                "Ford;2004;189797;27339.00\n" +
                "Opel;2012;53122;69164.00\n" +
                "Nissan;2001;163869;10848.00\n" +
                "Fiat;2010;100731;60318.00\n" +
                "Audi;2000;220430;4394.00\n" +
                "Opel;2009;80786;50519.00\n" +
                "Audi;2016;11579;91742.00\n" +
                "Skoda;2009;64094;52974.00\n" +
                "Kia;2017;4726;95944.00\n" +
                "Skoda;2015;21484;85326.00\n" +
                "Opel;2000;141867;1142.00\n" +
                "Volvo;2002;126937;13355.00\n" +
                "Audi;2017;5455;94101.00\n" +
                "Peugeot;2001;169531;5648.00\n" +
                "Nissan;2016;17292;92386.00\n" +
                "Skoda;2001;160973;5813.00\n" +
                "Nissan;2012;47658;71148.00\n" +
                "Fiat;2003;148670;19685.00\n" +
                "Ford;2000;192667;4659.00\n" +
                "Opel;2002;182644;14640.00\n" +
                "Ford;2017;8657;94950.00\n" +
                "Kia;2002;215951;15106.00\n" +
                "Audi;2016;18779;88111.00\n" +
                "Peugeot;2017;6055;98136.00\n" +
                "Seat;2006;89251;35793.00\n" +
                "Mazda;2016;14565;90387.00\n" +
                "Peugeot;2001;210415;9690.00\n" +
                "Peugeot;2006;102655;35775.00\n" +
                "Kia;2014;37920;80516.00\n" +
                "Audi;2010;65624;57498.00\n" +
                "Volvo;2013;61625;74916.00\n" +
                "Fiat;2016;15943;89873.00\n" +
                "Opel;2000;172170;1458.00\n" +
                "Peugeot;2015;24469;83312.00\n" +
                "Seat;2011;73985;64012.00\n" +
                "Kia;2008;73656;45378.00\n" +
                "Kia;2015;19753;85872.00\n" +
                "Volvo;2015;23983;86968.00\n" +
                "Nissan;2013;55027;73654.00\n" +
                "Nissan;2015;22649;83956.00\n" +
                "Skoda;2004;110110;26993.00\n" +
                "Kia;2017;3485;98281.00\n" +
                "Nissan;2000;230826;1904.00\n" +
                "Kia;2010;109867;55538.00\n" +
                "Seat;2003;114103;19677.00\n" +
                "Mazda;2010;103232;59069.00\n" +
                "Volvo;2012;80085;70246.00\n" +
                "Kia;2012;47640;70242.00\n" +
                "Opel;2009;90652;51875.00\n" +
                "Volvo;2011;69749;64313.00\n" +
                "Fiat;2011;76531;63763.00\n" +
                "Nissan;2009;119223;52746.00\n" +
                "Skoda;2006;89536;36877.00\n" +
                "Opel;2002;192811;13552.00\n" +
                "Ford;2017;853;98904.00\n" +
                "Nissan;2005;165775;28078.00\n" +
                "Opel;2013;57671;74616.00\n" +
                "Skoda;2005;163735;28982.00\n" +
                "Ford;2001;220542;9535.00\n" +
                "Opel;2012;62458;70869.00\n" +
                "Seat;2016;13858;89679.00\n" +
                "Mazda;2002;152556;15936.00\n" +
                "Nissan;2005;114317;27872.00\n" +
                "Seat;2009;108911;51813.00\n" +
                "Kia;2002;155963;13310.00\n" +
                "Nissan;2015;24230;83613.00\n" +
                "Seat;2000;246642;931.00\n" +
                "Seat;2015;29704;85652.00\n" +
                "Ford;2014;29357;79989.00\n" +
                "Ford;2014;46870;78998.00\n" +
                "Fiat;2010;76133;57742.00\n" +
                "Skoda;2011;51398;63963.00\n" +
                "Audi;2003;171191;17738.00\n" +
                "Audi;2010;96633;57027.00\n" +
                "Nissan;2016;14939;90545.00\n" +
                "Peugeot;2012;59683;70353.00\n" +
                "Nissan;2001;136941;5972.00\n" +
                "Opel;2001;207110;5726.00\n" +
                "Nissan;2016;13506;89501.00\n" +
                "Volvo;2012;54042;71377.00\n" +
                "Peugeot;2002;114738;15769.00\n" +
                "Skoda;2009;90694;54458.00\n" +
                "Audi;2001;192904;5634.00\n" +
                "Audi;2009;77890;50124.00\n" +
                "Volvo;2012;59494;70180.00\n" +
                "Peugeot;2011;73841;64874.00\n" +
                "Nissan;2017;8417;98808.00\n" +
                "Kia;2001;171024;9251.00\n" +
                "Seat;2000;215545;5358.00\n" +
                "Kia;2017;4070;98271.00\n" +
                "Ford;2014;42752;80919.00\n" +
                "Peugeot;2010;67084;57579.00\n" +
                "Skoda;2002;185864;12868.00\n" +
                "Opel;2014;28079;82301.00\n" +
                "Ford;2015;36605;84574.00\n" +
                "Ford;2006;163752;37646.00\n" +
                "Opel;2000;179556;1716.00\n" +
                "Seat;2010;76815;58493.00\n" +
                "Ford;2006;141455;37025.00\n" +
                "Seat;2003;171854;19603.00\n" +
                "Seat;2013;48632;72778.00\n" +
                "Kia;2014;35884;79191.00\n" +
                "Ford;2017;906;95661.00\n" +
                "Volvo;2000;240293;1917.00\n" +
                "Opel;2015;24241;84263.00\n" +
                "Ford;2011;55289;64748.00\n" +
                "Nissan;2000;146142;2464.00\n" +
                "Peugeot;2001;214419;8425.00\n" +
                "Kia;2016;14452;89839.00\n" +
                "Opel;2017;9693;99384.00\n" +
                "Kia;2002;197624;15976.00\n" +
                "Opel;2011;59411;64471.00\n" +
                "Nissan;2014;37528;79089.00\n" +
                "Kia;2006;141324;36153.00\n" +
                "Volvo;2002;184645;14796.00\n" +
                "Volvo;2003;180018;21802.00\n" +
                "Opel;2013;61236;75768.00\n" +
                "Peugeot;2001;208752;8684.00\n" +
                "Skoda;2016;14683;88372.00\n" +
                "Nissan;2017;12568;96976.00\n" +
                "Ford;2003;111757;21266.00\n" +
                "Fiat;2003;135682;17239.00\n" +
                "Seat;2005;169441;27937.00\n" +
                "Nissan;2001;223043;5503.00\n" +
                "Skoda;2007;91208;39742.00\n" +
                "Nissan;2010;63544;56120.00\n";

        return text;
    }

}