package algorithms.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void scenario1() {
        List<String> input = Arrays.asList(
                "cat", "listen", "silent", "kitten", "salient"
        );

        assertEquals(
                4,
                GroupAnagrams.getGroupedAnagrams(input)
        );
    }

    @Test
    public void scenario2() {
        List<String> input = Arrays.asList(
                "pat", "tap", "apt", "bat"
        );

        assertEquals(
                2,
                GroupAnagrams.getGroupedAnagrams(input)
        );
    }

    @Test
    public void scenario3() {
        List<String> input = Arrays.asList(
                "inch", "cat", "chin", "kit", "act"
        );

        assertEquals(
                3,
                GroupAnagrams.getGroupedAnagrams(input)
        );
    }



    @Test
    public void scenario4() {
        List<String> input = Arrays.asList(
                "ksauttfsouisvihdjnqsmcyt"
                ,"wvpkgjqnhncqsumrwmwnfptfttwlwrhnbklrzathdez"
                ,"epukvhsjmxuoeytedoerxyizmdfquifdurkghvyxrvq"
                , "meuvlf"
                , "vwyhcwtkfwwzbjunlqzzguwydwkaikyyuadhag"
                , "hma"
                , "qrvkvgtczbwagxgqxsojymdpjpzkpqjwjrouxv"

                , "erkdlgwdaexxtilk"

                ,"cbgzwjrvdxxmrcpsxywdp"

                ,"mzerhfiablajubjfntwfkbbprtuapwj"

                , "nvuqcjwvlxhdgterozivavrfbltegjz"

                , "nequmbobdzat"

                , "ezfsnmrmepemjjiqnuccqwanngnnymrdtmwpdgip"

                , "nzyovlyuaylqvgvtyfyseftwvukmkygnh"

                , "iacbagxvczfaukqafsowpds"

                , "uirxewflpofikzbqwaamlkmqgjx"

                , "fyjzjnplomtbpfrizjeksjagupkljbrteko"

                , "otzqphyivahpdb"

                , "c"

                , "vlqnobxvrbxzqxdwccdyjnjpjatfwvjjbwp"

                , "by"

                , "umbdahcovmdkhwkgo"

                , "pwjloprdvdlqhhteklxxxxpfcdfisdebnxhdw"

                , "ewqehizydlrobkixhtjkuudkjffsaztsxngihxocmwvleyzycy"

                , "hewtyd"

                , "zvyikznyltwtmuxdpjhlmjukywmrhfbcuewwsxpacek"

                , "xngaenqwiggnyobzbsncqhlkrxxkrtpfsiqyzhvo"

                , "demfvrcqglwmnddgivbjecnffcqbuxwmqgzvvoeuop"

                , "oeytn"

                , "exodaofhuqteayyncslwf"

                , "lcwgraakyajqhafeaxwvjlzgxboobsekxnvhstwuobdwrlfhgw"

                , "psnmqwekqrylsedvkcdtsnfuohntwzpelidf"

                , "wloeqmxlyggmgpdqclsqaoxjacdeahqszbmfoo"

                , "phoyzhfw"

                , "jlimhaiyxclgmvxmlwsesoncerkqcxinuflnbmcxnwjqfznre"

                , "feuszktyramt"

                , "rnpdmfblmylltjdtlgyrgteeqrfylonnajzcogbmi"

                , "itgdiauyclizzuiorhzwgfm"

                , "cfohvtohjsedfpjvrmcxbhtwnwdqacspytgrllaubjhkkwm"

                , "pyto"

                , "erecapflxpggmyurjavpatpmxrvfrevpwyepihx"

                , "ruhtpnxulurcantojxmvcuzzrdxeilgcaxcsvoiuvkzpgabqwu"

                , "nyexovigawtdaideoomagzttyynchkm"

                , "yhikphxhiptgyftzzwmxjmihiotlqsyed"

                , "njwvosieeiwqfcaeeqvnpzltyqpguvikufyqwttztog"

                , "fuurrsywqlvuufuggtnddofuxax"

                , "ilazapqbisfldjcbyrtoxhwlnzaplrnpsiszjffrrpud"

                , "ncqgasmtrqlfmusrgvddqtbhm"

                , "mpgjckrasqcgcclwofwvah"

                , "hvmkzi"

                , "djgxosiftimaetyidi"

                , "vrxnhwemezuysvcjpydahsdbfcfbqdoeiauzrugzx"

                , "atf"

                , "rygjerxpghobimofxx"

                , "nebqqugocnvmgpktwqfparkgmgc"

                , "bjtjfmvrwigwawlburjuwrkfqbtvsekfcjabk"

                , "ukdleefnqdjtoswpfmqmxoselhqabidsuxraqhw"

                , "qeniochcemwbbitcneayzvholcgdanlxllnrlaxiwpxa"

                , "rlglfomsedvajrxncl"

                , "sqnzlnl"

                , "u"

                , "dvxyyexesbjtsvrsstytennvmdtuxcpzgbaiczxhpqqtb"

                , "jqwohxqoy"

                , "ebinxcauca"

                , "fbtqnpqdrxolovrnvyuaagquvgqymhyegs"

                , "kmvcmfajtgxkcay"

                , "ukmjzhsgqjxqrscymkgdvczerayg"

                , "gohspwlmwjq"

                , "fkjtpivvzibkpcwtim"

                , "donzcnajeucvsjofvausrqrbnrohkbtp"

                , "tallholsfybpjvqhuxvqhrma"

                , "vkjhbmuvkrjoeuovqynnpwaillccguxdwmaspsakkbxcoyanp"

                , "htquhlnfommcjhnhfnvunfjbatspltcngjot"

                , "xnagvfqqenqoqwyhmgxsvifixywdgchtkijgutkxf"

                , "dodwnrjthduwfmsttvbeutlhkwhclzlhtwmtyrwfsvdah"

                , "hsgfifvbdxyuubesazdcyq"

                , "mjkitwgxtfhryhrmbbrvy"

                , "dt"

                , "rbihvvqbu"

                , "bdfeebttfrezdgtmjxaqvupictll"

                , "opjdntdfxnsuyftjasrvhgrhvqnkazrdluufzmvumonfofzqu"

                , "nvqvcmhtvejptopdhbledbfvyjfxjdlcxofigtrxlkogvp"

                , "ggevwowuecxpzbuvearalhxodskssx"

                , "xfnpupeymnvibfjkjkpmzeycsn"

                , "wvvrcanddckwmjpkoljbwltl"

                , "uoxppcrrhnzhfexltdjcweqichdqfvpjhtiiwxklhc"

                , "ycigzbzfevsgyhuhfehtacnp"

                , "gyfaopjlgqpunoimvxhyuqxpvrqioooqjgasmvbpfvjm"

                , "xubblmuprdisardvrxfcqvhzcmgvnjxiazi"

                , "qmksgkiajljfmwsmyryo"

                , "jvobaacvtngqslalzrmqkaqdncjtcfdl"

                , "auotnolgmgvpbcacegjxxbraajiuaezeq"

                , "nslwmnahhfumugddqmibgfwfrijkvv"

                , "yzzlbmhviqvsmpdljjopcuxeyrlkurycfsrbkrwaugxnejtjw"

                , "omfgsfcjgnqzvdjmidbypuonaujjjwg"

                , "fvoijj"

                , "nupcgdqdgbeyqndkdmhqdjzxacvxaaxqiwoltselzbwyyumem"

                , "yzdgypnywjxcwodluqlmomeaxfotdjzqvko"

                , "clyuszjbimkwdhunudk"

                , "vxrikoacwoovkkrm"

                , "feeuccqlsztvmpkopkhzcbdcmfthlodfdeeikqxrfz"

                , "hnoqyqhuoppmxku"

                , "mekfouw"

                , "uwnwrpwgathglwurqbbioupujlvbbsfndeglljqlmlhdgrfy"

                , "tksewgatonholmgsalrnzrnldxghgsrowe"

                , "kz"

                , "qvefsvurab"

                , "kyhhdbofjacdiosqichsgfyuoicsvdllwdopxlxkxicanbcdvt"

                , "zynrhrjvpv"

                , "xfkpyedoxpluhawctwzw"

                , "yaygauavtlfgyvrrfemfvtzaafjjen"

                , "xambqhxzomvspksgrme"

                , "ycbvbigcnzgqhlqckokwedvihphzivlkfcz"

                , "yqgkymttcjowvvespdrkkuebtjohmufpxj"

                , "zuwy"

                , "gayaadboxqsh"

                , "movovlacjngtxrkullfimfyqdsrnkzpt"

                , "ieqjor"

                , "vroszifkfxw"

                , "fwbvgpqfyghfanfgfncyedifffbdhlrmbhamut"

                , "vhzz"

                , "kylxfvnlcnaypms"

                , "eucijmtilzphvejyvrnauwyljvlhklfmlhqlutyluhkvux"

                , "kzbkdjaxnxmcbvfhouapivgwvcmpma"

                , "zplvojagsnljcaggguzmshlqytkvfuqubeeboifodlue"

                , "oxkqotaowvlaryfynfdbagque"

                , "ckgwwdflynnaotrjfikikznted"

                , "cxnctawyhbcraw"

                , "ghlvpjbgppxagmfpubybzxxqwjqequ"

                , "zepwdqcbfhujtazebfz"

                , "lpdgqmgwqucfwdchlrvflenqxjmbfusokbjkp"

                , "cseizlgmxbxdicvvshbepbdpns"

                , "jafdugkhwvmdexhytdyzkwjclnpbgrjdmbtpppzbma"

                , "voireyttwzikvmnpgmicnui"

                , "flrcjinqpdyqmaqmwyndxgpfepnfkoxbwnwvraiil"

                , "eroyirvkbjdvxxcwyrfdthiwqtsxfqwxvxviksvpmaa"

                , "ghgovxjfgjxrppexixwprc"

                , "gtugnnxdaban"

                , "cg"

                , "aothepgqgphoiugbmfnwbdvv"

                , "qylgf"

                , "ozbjm"

                , "nisiiucsvpmpevrquujrvooeuxs"

                , "dvczx"

                , "rrrj"

                , "rfwnjvpdkirvz"

                , "auoxfqbeohjiasuoywontlsgdcndnw"

                , "oyczcbwoiifenpqxlhmmnojk"

                , "fwdhzgdojtaxzxzrjqemcimojcoxgwz"

                , "bjluvaxaxpiftxovuxakxphtac"

                , "wypyjrjqrrgrdespiqtpkh"

                , "qvoqotisyhntszujytdnhjsnclnclcocdrphqsmisdith"

                , "rxpkyykmtbedtxighjy"

                , "qvviigfqncgqoumoigicooegvoqibyomssbuqpy"

                , "kognzglpjuzwytpubtjyuzkdghwbf"

                , "aesmzwoall"

                , "bbnbntwtvfnwpaqjiqzjxkgsgylfq"

                , "qokqpjaxjivtomfhcjqncibj"

                , "ndgchzljsilkgdqzwwzvsbawflkm"

                , "spauhbqjgcurocpcctfffbq"

                , "fwocshabebdttfslbfcfhrvqjxudgrhz"

                , "tahtotggmjduuodgpytc"

                , "uojcavjkhcpqrinldwrtatrsivbbkzjvokspv"

                , "rorgvtd"

                , "temdfljzjsvnevdkxjxtbjcrugfvvslmigjxuseshgxgmwuh"

                , "eanybcmrznifzwsnrueqhknycouiajw"

                , "dirrejaedoofsyllvnwnhcavshxutcle"

                , "hvkskeukpdemwbjagktz"

                , "ilvhchqoewnxlpmqonvuqrngbwqvbwcryxzcx"

                , "isnnwxylndpmuvksuxerwsc"

                , "aleyngcpfgntkniasfsqtskiahlegehvkuvfqcqvq"

                , "hluzxlwxluwkelszoulveqmzo"

                , "blpcabipyztmawzllkouukaduphwkbfqjrlj"

                , "eynal"

                , "r"

                , "wvaxssnrmcsqitb"

                , "vtlwqvenfsi"

                , "bdgjshakyjlwkcrcfncelzwzlhmapfjhfjqiiqwxnoiwef"

                , "ovapzbduewvbpl"

                , "obtbte"

                , "brjtusuwsgfcazpoylvnfnzfrczfvmewxihcxtbtgknftohbr"

                , "yvegljwnblfuqigkqzgjhmtiraxxwfwawmxwmunopptzjmbsc"

                , "qqjghwtxhcwu"

                , "ubygbhtgcmeyfggldic"

                , "ywzbegpzfmuynjvkdmicwccjgm"

                , "wpgmrnjbplxmnuoypum"

                , "myoowygpjg"

                , "mvhusgvjbbuqhkbup"

                , "aeclfiuidukcnxbqqnvijkanrlwqwfrjiqloqpejw"

                , "uurtxyvhhyfxtkcutpziiqnkoooga"

                , "spvnczteezwuclwdwlnpgpfarndsnzlztf"

                , "iummfwovrahphvfpxshlkjcgsopoknqgbmmckfiyvoupox"

                , "pzvjshvmemlvjzfwvetsl"

                , "cdhmenxlvmnvkktwiyaibipjlpxilcgtmsfhry"

                , "hjreihtztyswsxppcbdwnrbktqrpgsgjagmwckfgnmbtvxvf"

                , "haqzzfrfh"

                , "lrd"

                , "ktydqoeivykptyuqlentikuamdfrxqhdjrwbpixhohbeuupdg"

                , "yezbgzqezclhlgipqxkiqrrjno"

                , "fqfxkenbbkuvmnve"

                , "nvop"

                , "sdsgrckvhrprvygjzmacypfyinbtnqjsvukjctge"

                , "yusykfqtmgonbftwizerwxoifhffufxtgbbexcr"

                , "uryiyhxhjdfagcekmuyukb"

                , "uk"

                , "hehybinfkyms"

                , "jttejvqzpkbqgxcjvqzjhklkkjumvibjrbjcacd"

                , "vvqpmqgozujvmwkfsihmm"

                , "idnccuqpoutqpnysldqdtkylecqljw"

                , "rolhlnqojyyhjkzqttdka"

                , "piibuhdsggqqfzvv"

                , "bxvk"

                , "auuhwsafnwowuvgsiaslvcrjmwbqjavhcvezq"

                , "ztywivwfnvqnjtnfmdzsvfdsrszawthnqwjttmqjegnhvdk"

                , "jlgfttiutnqtdyrzckpebfgbakqrfqdspzb"

                , "wjfvzrkgpyzafkbpsrr"

                , "ksiwtxe"

                , "zcaamgitysjs"

                , "qsoumlaucczbiluehzvxja"

                , "prsbcqtspveylsphzpvcknfpkrk"

                , "bngqjvxtrfqpzcleajcrjyukgtirjirlgiwewkpokvzwk"

                , "siwbthcfspinjshqoabnncmjwvx"

                , "fskqybd"

                , "eqypesuxlnharfbkjctbbawmocurysbsvatagevsmmefox"

                , "vgblbjcgawtgjiiiokrntxvffstkddlzyzckubescfecjeb"

                , "bgnsgkmvaijddlqorovoagvwuufkgvpgiwbcvtcddbadn"

                , "sbyuiiqcpepuyqcisuliclrgywvnmurpk"

                , "amtopevfjzjxcglcmytqsmfnqemvqbnajigjmiwnnzupez"

                , "jtzsjjintcrwnpqzsjculkjigvntz"

                , "dsmgmnjgkkhpyegyipuvubnaoqhrgczpdtgdvydihfaffdjh"

                , "cfyrt"

                , "illunuspcdgvuarb"

                , "lttwpvisrtson"

                , "vtgjoerfgnkmuwfxisnlxydyaalqge"

                , "xfcovzctnsqhxhtzfbvkavehxxsjrgemcuuouikvdeuqkwprs"

                , "igiekbc"

                , "igndujybobutoslhbekczdgzsqvbmepdsmknjnpwk"

                , "kxoejnxvarmdbi"

                , "cawcgnckbyfbdftzixfzlcjbmkjoxbjxepemgsnns"

                , "xldwtengodaumrnbvcexwhjcftsiqqwtswxpburhnkyfkivk"

                , "ezqrdwdopuxvlleyziqzeobpylexqvhbjatlbbbfcvgmkmeil"

                , "adcsfllnraqtlvjcclhvfryxfxmkfeeztphjjxzukkr"

                , "f"

                , "thtdfvabmtcuxtzernlymhczubijvyrbwjwaa"

                , "wuouszapubasxagucyhd"

                , "tvbyeinocbggarcxoercfp"

                , "tgojoaqcx"

                , "ichadldanghnedpvxwpwwpzuiofzfaoxzkg"

                , "wkvqvjfkedtryybhyapdbuwcqafzvespyarrerhuyznqq"

                , "qfrsydwucvdgokuqqppprxlyw"

                , "uehxwuuypymwu"

                , "tprqjfx"

                , "atqebsemm"

                , "jimoxysomvxkqrrdgnngkxngfupyswgzzzgwqo"

                , "iigedluxigqstpwwpfzmzcnnyy"

                , "nlccdeilxxnpnehrfwukahoxlnpyxreljldktgjxhkzi"

                , "pvuulnxwpfbxmelzziexumgxzpmmeocn"

                , "n"

                , "zanhgyfpyuveovsgneamupfohttaiyvaelmfqlcgmttil"

                , "oorj"

                , "gljtovtjabqlenujspheuxppxtkk"

                , "cbsrpjwgrumqzln"

                , "dppgcnopkvudmfyuemxxvkurzldlulddgshlamgcqvpoibjhi"

                , "mrpsozfqjgrqgthhgslvuyueghgievu"

                , "jkzudekmbivnksykqwerqngumezgpnqzqeaxlmorqh"

                , "xblprotwyyxuumlcejfqbwh"

                , "cutpatlbjn"

                , "bazmfncpymjujzjrgwdkvkpom"

                , "svptgzeweawq"

                , "dexyatslgfgimpwqgfjucqmegwnqlmq"

                , "jlmkknmypecqnl"

                , "lmkzqqza"

                , "djmtgqpbi"

                , "llxlepaasiqyxlhdnjboocnqf"

                , "gwbcekzenurvehgxenzotsjeqikrr"

                , "cpqpgprrsdjtxjonbshookdvkpzsnmckvmetzrs"

                , "a"

                , "iuoglfflqqhybfilwibgebgxoydo"

                , "pxqbvlkbytrnjsyrbq"

                , "ibbfnrjrmtwxqljeupyvzdimttjmzujpiv"

                , "tllpqpugnmbpigsdhhbmgaoakshellojasschcwbxggdaj"

                , "zrpdunzukkjmbpggqbmvtjzpztylukyjzrt"

                , "nnigwlcamilrxndjnoqycfpztsfxhpsupegywg"

                , "qvqoehmtqywcmqviz"

                , "ojxbcovgufelafdxrartmvxraulfojdbgrpamamhl"

                , "kdpssvcbxjdujxwzv"

                , "grevem"

                , "caszldicwnjfoyflzhgzggjxsj"

                , "jfshnhumxsqyofifdaapcjzccinrgqwimucntatlqxgbvjjsp"

                , "fnlzzdhsilckpvqegnowsnfwuglcbuepzwaobnfhpugoaa"

                , "zwwmpihfzkscozldsqvicabklfwaozxcaivxxzuomofuqfdxan"

                , "nnkxzzfcbljbpqiujnbuvfnsfq"

                , "mnetgyanljdzpbvtokbouohjscoodokjgrmtcp"

                , "wlkzwkpkghyrfzzvnpdhxdjbrbmxqstpllzlbekug"

                , "jujesybryuzhkgebzqqtnpgbojpesnvkwwadevygz"

                , "vcttvoipqgnlkdnztjzbjzpzfdcozgldsycskssxhmhpxnse"

                , "my"

                , "hjwqlmbzffcqvcgazcykpprdrlddrwnxoiuqsvwhppbzav"

                , "xmwzovjhacbbjuxa"

                , "dppzvwtogsvfjykbrrsjupqn"

                , "tqehzjomoanrmdzflxcnwuhblyxckosfrz"

                , "btgadwt"

                , "tqmeplcmyemqcxueidjhf"

                , "lajhltaprmgbu"

                , "wcwqct"

                , "qyxsqruvftcjgftiovkdbyusgwbglrwpbwktlfylutmcdad"

                , "kxpjkyuinrmddkqpqilad"

                , "qflzueoiyhtryghwmztvzencurbc"

                , "wtwbyesjgrquvxu"

                , "zbxuat"

                , "zqgozopvduxsvpjhnvznjdvcgzdqulgtylcmuwyhwyckbxpvze"

                , "fixsdvrxntmotbudzmiwqjtcnhjtgsebuucyrceoljeaywqgo"

                , "hgxqgqpchboofmqmqpfdvdngfsyfyylcbnyhst"

                , "fqxbfykbvjkwyigqdneayh"

                , "ahqrhtabsviwtrimeobvlmorousjyl"

                , "kmrtqjdadnpxmjuosqajgckspyekgqirmnkllclhhd"

                , "aedspfsibipcylbqpvypivxbikiiggyqvqpbkfixwemp"

                , "tzxgqwixxfffiwcommejucgtivjicatdjphvysgvryha"

                , "mkseucvrkifvodpqhzuasu"

                , "rqvxaaumxmiwlrz"

                , "hunpruxuifpihubxdr"

                , "mgelhfwntbokfrcgojlwzlhkrcypuzqxmkgvg"

                , "nhytsvkietzrrixqzkaidyiqppw"

                , "dxssvwkrlzmkzbehkggjfhpczsbqowpsakb"

                , "kesznthfxgkrfiwkptnkxkdlklhqldfg"

                , "tnyl"

                , "hrwxmzwmtcc"

                , "j"

                , "kdcuvdtixntpuxclqmuzwqznlrmszwudcecpaqcydsjkb"

                , "xjltophjo"

                , "zbjkhpjkudlgfvbkctqynszmpktwqaycxefkkhszvjoqs"

                , "jwsgqoynpi"

                , "aihqdnwvphyyisxmqzqeq"

                , "osyreotf"

                , "xojldkq"

                , "spqxzccjbpiyxymrhjrwuesvjnwhjridfamaoizleqfu"

                , "eujbohbgfraerwmqkjchkefqigfhyytmnirrecrywtfrap"

                , "qvebxmewgfruxumtxrfimqacvqn"

                , "rxkhmotxhkaeslbfmjbryuacqypvhhueqhfqs"

                , "siwsesqxgogirijyufmuvze"

                , "hodrwkevg"

                , "khgachsgacckdava"

                , "baybpeqxrrbrqwrinhsmqbwxuuncmkkvafeafecw"

                , "zlltuqvjxyxljcotizeroxjxymztmrfpymvnqtfji"

                , "og"

                , "eaqkxdzuecobauppyttzzbscmvjmeebfbhwylidhitqe"

                , "vjifiiqltvxnyypvzosw"

                , "mklortjimhjrbxpjslcljsqloymfzxndbmssbvlml"

                , "azlfjb"

                , "z"

                , "vkrzebfce"

                , "ybpcfrctsfidchxhhdymquyekgwuqzjlacpvrnm"

                , "loqvcffrohbi"

                , "fvlwqge"

                , "vzoqwphejctdkpdfqbszufkndspjreacrndrfvuitd"

                , "mqim"

                , "itvcvxujwqwrqjlvwbfyzfmtlcbtjzkpqcaamblyuuixsmlcyt"

                , "cgpolfglphvwdoesuaojcyxrrdllgbnvsjkq"

                , "rhfralpdbhatelcs"

                , "nlywjnhwosirnktazradxkzpmkgsejmfcfcyzundkybtzt"

                , "aafwpwobcntvqedsotmcdhjttj"

                , "kxmehywmaepkvpdhzlsxiecilrklhnwzmlbmhkqk"

                , "nohwcmspomrkezibdjazclv"

                , "unyoaje"

                , "ouwacmuwnjgbtqipy"

                , "rrjcvsnojyfdzubqahuaflvybzdfffsqdbb"

                , "kdcvin"

                , "ehwmuyyiupxsvvevtl"

                , "kuzljbuwdntnhonjwxrwussrtpxezljbyfovgdhfldnekladqe"

                , "nucepfxetjzz"

                , "apjohyntfhgoruanlmlghejk"
                , "ukesvtskvlusc"
                ,"uxrdejpjygydncbjrionzkfbmwyzdojrzcrqkhqfjxoeotuq"
                ,"civiybzqgqcddbmwhuusvckdhygfybgyxzk"
                ,"pmnhxuxgbjsecancrlmow"

        );

        assertEquals(
                375,
                GroupAnagrams.getGroupedAnagrams(input)
        );
    }



}
