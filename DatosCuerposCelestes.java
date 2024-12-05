import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatosCuerposCelestes {
    public static List<CuerpoCeleste> obtenerCuerposCelestes() {
        List<CuerpoCeleste> cuerposCelestes = new ArrayList<>();

        cuerposCelestes.add(new Estrella(
                "Sol",
                "El Sol es una estrella, es decir, un cuerpo celeste que brilla con luz propia, compuesto de hidrógeno y helio a enormes temperaturas en estado de plasma. Es la estrella mas cercana a La Tierra y de la que depende toda la vida en ella. Concentrada en el Sol encontramos el 99,85% de toda la masa del Sistema Solar.",
                5772,
                1.0,
                "imagenes/sol.jpg" 
        ));

        cuerposCelestes.add(new Planeta(
                "Mercurio",
                "De los cuatro planetas interiores del Sistema Solar, Mercurio es el más pequeño. Muy denso, su estructura interna está dominada por su enorme núcleo de hierro. Al ser el planeta más cercano al Sol, experimenta variaciones extremas en la temperatura de su superficie, que oscila entre los –180 ºC y los +430 ºC. Mercurio es el planeta más pequeño de nuestro sistema solar. Es apenas un poco más grande que la Luna de la Tierra. Sin embargo, Mercurio no tiene lunas. Es el planeta más cercano al Sol, pero en realidad no es el más caliente.",
                false,
                new ArrayList<>(),
                1408,
                3.7,
                58,
                "imagenes/mercurio.jpg"
        ));

        cuerposCelestes.add(new Planeta(
                "Venus",
                "Es el planeta más cálido del sistema solar. Es un planeta terrestre: es pequeño y rocoso. Su atmósfera es densa: atrapa el calor y por eso es tan caluroso. Tiene una superficie activa, que incluye volcanes.",
                true,
                new ArrayList<>(),
                5832,
                8.87,
                108.2,
                "imagenes/venus.jpg"
        ));

        cuerposCelestes.add(new Planeta(
                "Tierra",
                "El planeta Tierra, es un planeta terrestre y rocoso. Tiene una superficie sólida y activa, con montañas, valles, cañones, llanuras y mucho más. La Tierra es especial porque es un planeta océano, ya que el agua cubre el 70% de su superficie. Nuestra atmósferaestá compuesta, en gran parte, por nitrógeno.",
                true,
                Arrays.asList("Luna"),
                24,
                9.8,
                149.6,
                "imagenes/tierra.jpg"
        ));

        cuerposCelestes.add(new Planeta(
                "Marte",
                "Marte es el planeta interior más alejado del Sol. Es un planeta telúrico con una atmósfera delgada de dióxido de carbono, y tiene dos satélites pequeños y de forma irregular, Fobos y Deimos (hijos del dios griego), que podrían ser asteroides capturados​​ similares al asteroide troyano (5261) Eureka. Marte tiene la mitad del tamaño de la Tierra. A veces es llamado el planeta rojo. Es rojo debido al hierro oxidado de su suelo. Al igual que la Tierra, Marte tiene estaciones del año, casquetes polares, volcanes, cañones y tiempo meteorológico.",
                true,
                Arrays.asList("Fobos", "Deimos"),
                25,
                3.71,
                227.9,
                "imagenes/marte.jpg"
        ));

        cuerposCelestes.add(new Planeta(
            "Cinturón de Asteroides",
            "El cinturón de asteroides es una región del sistema solar que se encuentra entre las órbitas de Marte y Júpiter. En esta región hay alrededor de 100.000 asteroides de distintos tamaños, desde rocas pequeñas hasta asteroides con sus propios satélites. La masa total del cinturón de asteroides es de entre 3.0 × 1021 y 3.6 × 1021 kg, lo que equivale a un 0.06 % de la masa de la Tierra.",
            false,
            new ArrayList<>(),
            0,
            0,
            414.4,
            "imagenes/cinturon_asteroides.jpg"
        ));

        cuerposCelestes.add(new Planeta(
                "Jupiter",
                "Júpiter es el planeta más grande del sistema solar y el quinto en orden de lejanía al Sol.​ Es un gigante gaseoso que forma parte de los denominados planetas exteriores. Recibe su nombre del dios romano Júpiter y los antiguos griegos le daban el nombre Fenonte.",
                true,
                Arrays.asList("Metis", "Adrastea", "Amaltea", "Tebe", "Io", "Europa", "Ganímede", "Calisto", "Temisto", "Leda", "Himalia", "Lisithea", "Elara", "Carpo", "Euporia", "Ortosia", "Euante","Tione", "Mneme", "Harpalike", "Hermipe", "Praxíice", "Telxione", "Iocaste", "Ananke", "Arche", "Pasithee", "Herse", "Chaldene", "Kale", "Isonoe", "Aitne", "Erinome", "Táigete", "Carmé", "Cálice", "Eukélade", "Kallichore", "Heliké", "Eurídome", "Autónoe", "Spondé", "Pasítea", "Megaclite", "Sinope", "Hegémone", "Aedea", "Calírroe", "Cilene", "Kore"),
                10,
                24.79,
                778.5,
                "imagenes/jupiter.jpg"
        ));

        cuerposCelestes.add(new Planeta(
            "Saturno",
            "Saturno es el sexto planeta del sistema solar contando desde el Sol, el segundo en tamaño y masa después de Júpiter y el único con un sistema de anillos visible desde la Tierra. Su nombre proviene del dios romano Saturno. Forma parte de los denominados planetas exteriores o gaseosos.",
            true,
            Arrays.asList("Pan", "Dafne", "Atlas", "Prometeo", "Pandora", "Epimeteo", "Jano", "Egeón", "Mimas", "Metone", "Palene", "Encélado", "Telesto", "Tetis", "Calipso", "Dione", "Helena","Pollux", "Rea", "Titán", "Hiperión", "Jápeto", "Kiviuq", "Ijiraq", "Febe", "Paaliaq", "Skadi", "Albiorix", "Bebhionn", "Erriapo", "Siarnaq", "Skoll", "Tarvos", "Tarqeq", "Greip", "Hyrrokkin", "Mundilfari", "Jarmsaxa", "Narvi", "Bergelmir", "Suttungr", "Spondé", "Pasítea", "Megaclite", "Hati", "Bestla", "Farbauti", "Thrymr", "Aegir", "Kari", "Fenrir", "Surtur", "Ymir", "Loge", "Fornjot"),
            11,
            10.44,
            1.434,
            "imagenes/saturno.jpg"
        ));

    
        cuerposCelestes.add(new Planeta(
            "Urano",
            "Urano está compuesto de agua, metano y amoniaco sobre un pequeño centro rocoso. Su atmósfera está hecha de hidrógeno y helio, como Júpiter y Saturno, pero además contiene metano. El metano es lo que le da a Urano el color azul. Urano también tiene anillos tenues.",
            true,
            Arrays.asList("Cordelia", "Ofelia", "Bianca", "Crésida", "Desdémona", "Julieta", "Porcia", "Rosalinda", "Cupido", "Belinda", "Perdita", "Puck", "Mab", "Miranda", "Ariel", "Umbriel", "Titania", "Oberón", "Francisco", "Calibán", "Stefano", "Trínculo", "Sycorax", "Margarita", "Próspero", "Setebos", "Ferdinando"),
            17,
            8.87,
            2.871,
            "imagenes/urano.jpg"
        ));


        cuerposCelestes.add(new Planeta(
            "Neptuno",
            "Es el último de los planetas de nuestro sistema solar. Está más de 30 veces más lejos del Sol que la Tierra. Neptuno es muy parecido a Urano. Está compuesto de una espesa mezcla de agua, amoniaco y metano sobre un centro sólido del tamaño de la Tierra.",
            true,
            Arrays.asList("Náyade", "Talasa", "Despina", "Galatea", "Larisa", "Proteo", "Tritón", "Nereida", "Halimede", "Sao", "Laomedeia", "Psámate", "Neso"),
            16,
            11.15,
            4.495,
            "imagenes/neptuno.jpg"
        ));

        cuerposCelestes.add(new Planeta(
            "Plutón",
            "Plutón es un planeta enano que se encuentra en el cinturón de Kuiper. Es un área llena de objetos helados y otros planetas enanos en el borde de nuestro sistema solar. Debido a que Plutón es el objeto más grande conocido en esta región, algunos lo llaman \"Rey del Cinturón de Kuiper\".",
            true,
            Arrays.asList("Caronte", "Nix", "Estigia", "Cerbero", "Hidra"),
            153,
            0.62,
            5.916,
            "imagenes/pluton.jpg"
        ));

        cuerposCelestes.add(new Planeta(
            "Cinturón de Kuiper",
            "El cinturón de Kuiper es un anillo de cuerpos helados situado fuera de la órbita de Neptuno. Plutón es el elemento más famoso del cinturón de Kuiper. El Sol está en el centro de nuestro sistema solar. Está orbitado por ocho planetas: Mercurio, Venus, la Tierra, Marte, Júpiter, Saturno, Urano y Neptuno.",
            false,
            new ArrayList<>(),
            0,
            0,
            8.250,
            "imagenes/cinturon_kuiper.jpg"
        ));


        return cuerposCelestes;
    }
}
