package com.example.demo.entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.example.demo.repositorio.AdministradorRepository;
import com.example.demo.repositorio.DrogaRepository;
import com.example.demo.repositorio.DuenoRepository;
import com.example.demo.repositorio.EspecialidadRepository;
import com.example.demo.repositorio.MascotaRepository;
import com.example.demo.repositorio.TratamientoRepository;
import com.example.demo.repositorio.VeterinarioRepository;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner{

    @Autowired
    DuenoRepository duenoRepository;

    @Autowired
    MascotaRepository mascotaRepository;

    @Autowired
    EspecialidadRepository especialidadRepository;

    @Autowired
    AdministradorRepository administradorRepository;

    @Autowired
    DrogaRepository drogaRepository;

    @Autowired
    VeterinarioRepository veterinarioRepository;

    @Autowired
    TratamientoRepository tratamientoRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        mascotaRepository.save(new Mascota("sparky", "shih tzu", 3, 4.2, "juguetón", "https://cdn.pixabay.com/photo/2017/09/25/13/14/dog-2785077_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("toby", "husky", 2, 7.8, "energético", "https://cdn.pixabay.com/photo/2019/05/21/05/07/animal-4218265_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("princess", "pomeranian", 1, 3.5, "adorable", "https://cdn.pixabay.com/photo/2018/08/20/14/08/dog-3619020_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("chico", "dachshund", 4, 5.1, "curioso", "https://cdn.pixabay.com/photo/2016/07/15/15/55/dachshund-1519374_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("ginger", "golden retriever", 5, 6.0, "juguetón", "https://cdn.pixabay.com/photo/2017/09/15/19/49/dog-2753369_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("roxy", "poodle", 2, 3.8, "alegre", "https://cdn.pixabay.com/photo/2019/02/06/15/18/puppy-3979350_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("bentley", "bulldog", 3, 6.5, "relajado", "https://cdn.pixabay.com/photo/2020/07/20/06/42/english-bulldog-5422018_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lulu", "labrador", 2, 4.0, "juguetón", "https://cdn.pixabay.com/photo/2016/11/26/23/45/dog-1861839_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("peanut", "beagle", 1, 5.2, "curioso", "https://cdn.pixabay.com/photo/2023/05/20/16/48/dog-8006839_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("mochi", "shihtzu", 4, 4.5, "tranquilo", "https://cdn.pixabay.com/photo/2019/11/16/04/32/shihtzu-4629612_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("jasper", "corgi", 2, 6.8, "feliz", "https://cdn.pixabay.com/photo/2021/10/13/09/01/corgi-6705821_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("izzy", "pug", 1, 3.3, "juguetón", "https://cdn.pixabay.com/photo/2018/01/07/15/46/pug-3067600_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("apollo", "german shepherd", 3, 8.0, "leal", "https://cdn.pixabay.com/photo/2020/02/14/15/35/dog-4848668_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "french bulldog", 2, 4.8, "juguetona", "https://cdn.pixabay.com/photo/2019/12/22/17/13/french-bulldog-4713013_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("cooper", "schnauzer", 5, 5.5, "inteligente", "https://cdn.pixabay.com/photo/2016/10/31/14/47/dog-1785748_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lily", "maltese", 1, 2.5, "dulce", "https://cdn.pixabay.com/photo/2016/01/05/17/51/maltese-1123016_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("dexter", "boxer", 4, 7.2, "amistoso", "https://cdn.pixabay.com/photo/2023/08/23/03/33/boxer-8207572_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("sasha", "doberman", 3, 9.0, "vigilante", "https://cdn.pixabay.com/photo/2016/06/05/20/35/doberman-dog-1438132_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("zoe", "yorkshire terrier", 2, 3.7, "independiente", "https://cdn.pixabay.com/photo/2020/01/21/16/26/yorkshire-terrier-4783327_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("chester", "rottweiler", 4, 8.5, "valiente", "https://cdn.pixabay.com/photo/2022/10/10/04/23/rottweiler-7510724_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("bella", "labrador", 3, 5.0, "alegre", "https://cdn.pixabay.com/photo/2016/02/19/15/46/labrador-retriever-1210559_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("coco", "great dane", 2, 9.8, "gentil", "https://cdn.pixabay.com/photo/2015/04/27/21/00/puppy-742628_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("leo", "english bulldog", 1, 4.3, "joven", "https://cdn.pixabay.com/photo/2014/12/10/05/50/english-bulldog-562723_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("koda", "siberian husky", 5, 6.5, "amigable", "https://cdn.pixabay.com/photo/2019/05/21/05/07/animal-4218265_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("maddie", "border collie", 2, 4.5, "traviesa", "https://cdn.pixabay.com/photo/2019/05/21/05/07/animal-4218265_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("rusty", "golden doodle", 4, 7.0, "amoroso", "https://cdn.pixabay.com/photo/2016/08/29/07/40/goldendoodle-1627632_960_720.jpg", "activo"));
        mascotaRepository.save(new Mascota("shadow", "chow chow", 3, 5.2, "leal", "https://cdn.pixabay.com/photo/2020/03/25/11/54/chow-chow-4967027_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("luna", "akita", 2, 8.2, "divertida", "https://cdn.pixabay.com/photo/2017/07/24/15/07/akita-2534986_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("zeus", "bernese mountain dog", 4, 9.5, "fuerte", "https://cdn.pixabay.com/photo/2017/08/22/13/36/dog-2668993_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("nova", "shiba inu", 3, 6.0, "independiente", "https://cdn.pixabay.com/photo/2021/05/29/07/06/shiba-6292660_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("jax", "australian shepherd", 1, 4.7, "activo", "https://cdn.pixabay.com/photo/2022/12/19/06/31/australian-shepherd-7664795_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("oliver", "papillon", 5, 3.5, "inteligente", "https://cdn.pixabay.com/photo/2014/02/25/11/25/papillon-274183_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("zoey", "saint bernard", 2, 8.8, "gentil", "https://cdn.pixabay.com/photo/2015/11/12/20/32/st-bernard-1040956_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("riley", "pomeranian", 3, 4.0, "juguetón", "https://cdn.pixabay.com/photo/2020/01/09/15/03/pomeranian-4752990_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("moose", "mastiff", 4, 10.0, "tranquilo", "https://cdn.pixabay.com/photo/2015/04/22/12/23/dog-734688_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("ivy", "cavalier king charles spaniel", 2, 3.2, "elegante", "https://cdn.pixabay.com/photo/2020/05/08/16/06/dog-5146351_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("tucker", "doberman", 1, 6.3, "activo", "https://cdn.pixabay.com/photo/2016/04/17/10/37/doberman-1334496_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("daisy", "golden retriever", 3, 5.5, "dulce", "https://cdn.pixabay.com/photo/2019/07/30/05/53/dog-4372036_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("bruno", "bulldog", 2, 6.7, "juguetón", "https://cdn.pixabay.com/photo/2017/06/24/09/13/continental-bulldog-2437110_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "pug", 4, 3.8, "amorosa", "https://cdn.pixabay.com/photo/2017/05/16/04/17/pug-2316812_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("jax", "siberian husky", 3, 7.0, "curioso", "https://cdn.pixabay.com/photo/2019/05/10/13/21/husky-4193503_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("sadie", "labrador", 1, 4.0, "juguetona", "https://cdn.pixabay.com/photo/2020/07/14/02/47/chocolate-labrador-5402611_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("max", "french bulldog", 2, 5.0, "adorable", "https://cdn.pixabay.com/photo/2022/10/11/12/38/french-bulldog-7514203_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("ruby", "corgi", 5, 6.5, "divertida", "https://cdn.pixabay.com/photo/2021/10/13/09/01/corgi-6705821_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("bear", "pomeranian", 2, 3.5, "amoroso", "https://cdn.pixabay.com/photo/2014/08/10/08/17/dog-414570_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("rosie", "golden doodle", 3, 7.2, "gentil", "https://cdn.pixabay.com/photo/2016/08/28/19/01/goldendoodle-1626641_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("jax", "german shepherd", 4, 8.0, "leal", "https://cdn.pixabay.com/photo/2019/01/05/14/54/dog-3915191_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("zoey", "shihtzu", 2, 4.8, "juguetona", "https://cdn.pixabay.com/photo/2017/09/20/15/00/shihtzu-2768839_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("riley", "husky", 1, 6.5, "activo", "https://cdn.pixabay.com/photo/2016/10/26/14/44/siberian-husky-1771662_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lily", "beagle", 3, 5.0, "curiosa", "https://cdn.pixabay.com/photo/2018/12/15/16/01/beagle-3877115_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("rocky", "labrador", 2, 8.0, "juguetón", "https://cdn.pixabay.com/photo/2022/02/09/20/52/labrador-retriever-7004193_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("luna", "boxer", 4, 7.5, "amorosa", "https://cdn.pixabay.com/photo/2017/10/08/23/20/boxer-2831934_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("cooper", "yorkshire terrier", 1, 3.0, "curioso", "https://cdn.pixabay.com/photo/2013/10/15/08/20/dog-195877_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("mila", "schnauzer", 3, 5.8, "juguetona", "https://cdn.pixabay.com/photo/2016/12/21/17/54/miniature-schnauzer-1923470_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("charlie", "golden retriever", 2, 6.0, "amigable", "https://cdn.pixabay.com/photo/2019/12/03/22/22/dog-4671215_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "poodle", 1, 3.2, "dulce", "https://cdn.pixabay.com/photo/2017/07/20/03/50/poodle-2521137_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("duke", "doberman", 5, 9.0, "vigilante", "https://cdn.pixabay.com/photo/2018/10/30/23/00/dog-3784861_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lulu", "cavalier king charles spaniel", 2, 4.5, "elegante", "https://cdn.pixabay.com/photo/2017/09/25/13/11/dog-2785066_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("bentley", "french bulldog", 3, 6.7, "juguetón", "https://cdn.pixabay.com/photo/2014/02/28/22/45/french-bulldog-277255_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("mia", "pug", 4, 3.8, "amorosa", "https://cdn.pixabay.com/photo/2017/08/14/10/50/dog-2640079_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("max", "siberian husky", 1, 7.0, "curioso", "https://cdn.pixabay.com/photo/2016/07/28/22/13/dog-1549898_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("sophie", "labrador", 3, 4.0, "juguetona", "https://cdn.pixabay.com/photo/2020/06/11/20/06/dog-5288071_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("bear", "german shepherd", 2, 8.0, "leal", "https://cdn.pixabay.com/photo/2013/12/22/10/57/german-shepherd-232393_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "shihtzu", 5, 5.0, "juguetona", "https://cdn.pixabay.com/photo/2021/12/21/16/38/dog-6885621_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("leo", "schnauzer", 2, 6.0, "amistoso", "https://cdn.pixabay.com/photo/2016/03/05/17/54/schnauzer-1238155_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("oliver", "golden doodle", 1, 4.5, "juguetón", "https://cdn.pixabay.com/photo/2019/03/22/14/05/golden-doodle-4073353_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("luna", "corgi", 4, 5.5, "curiosa", "https://cdn.pixabay.com/photo/2020/03/31/19/19/dog-4988984_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("tucker", "beagle", 3, 6.0, "amigable", "https://cdn.pixabay.com/photo/2016/12/27/03/04/pet-1933138_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("daisy", "pug", 2, 3.5, "dulce", "https://cdn.pixabay.com/photo/2017/07/15/07/47/pug-2505763_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("rocky", "golden retriever", 5, 7.2, "juguetón", "https://cdn.pixabay.com/photo/2017/09/01/21/51/golden-retriever-2705639_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("molly", "schnauzer", 2, 4.5, "amorosa", "https://cdn.pixabay.com/photo/2018/07/08/21/18/labradoodle-3524825_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("zeus", "husky", 4, 8.0, "juguetón", "https://cdn.pixabay.com/photo/2014/03/20/23/48/siberian-husky-291721_960_720.jpg", "activo"));
        mascotaRepository.save(new Mascota("abby", "labrador", 3, 5.5, "amigable", "https://cdn.pixabay.com/photo/2020/11/12/13/44/dog-5735582_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("max", "french bulldog", 2, 6.0, "juguetón", "https://cdn.pixabay.com/photo/2019/02/25/14/45/french-bulldog-4019784_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("lily", "pomeranian", 1, 3.5, "dulce", "https://cdn.pixabay.com/photo/2016/07/26/02/01/pomeranian-1541798_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("charlie", "boxer", 3, 7.0, "amoroso", "https://cdn.pixabay.com/photo/2015/06/24/19/30/dog-820564_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("sophie", "siberian husky", 2, 5.0, "juguetona", "https://cdn.pixabay.com/photo/2016/01/25/10/46/dog-1160443_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("leo", "golden retriever", 4, 6.5, "curioso", "https://cdn.pixabay.com/photo/2018/04/06/13/07/dog-3295799_960_720.jpg", "activo"));
        mascotaRepository.save(new Mascota("mia", "poodle", 3, 4.0, "amistosa", "https://cdn.pixabay.com/photo/2021/02/03/03/32/dog-5976489_960_720.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("rocky", "doberman", 2, 8.5, "vigilante", "https://cdn.pixabay.com/photo/2015/12/18/16/54/dog-1098804_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("lola", "cavalier king charles spaniel", 1, 3.8, "elegante", "https://cdn.pixabay.com/photo/2016/11/21/12/04/animal-1844929_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("cooper", "french bulldog", 4, 6.0, "juguetón", "https://cdn.pixabay.com/photo/2019/07/21/14/05/french-bulldog-4352827_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("zoey", "pug", 2, 3.2, "amorosa", "https://cdn.pixabay.com/photo/2014/06/23/19/17/pug-375462_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("bentley", "labrador", 3, 7.0, "activo", "https://cdn.pixabay.com/photo/2019/06/02/12/03/labrador-4246322_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("lulu", "corgi", 1, 4.2, "juguetona", "https://cdn.pixabay.com/photo/2018/05/11/08/11/pets-3389730_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("sadie", "golden retriever", 5, 6.5, "amigable", "https://cdn.pixabay.com/photo/2019/12/03/22/22/dog-4671215_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("max", "beagle", 2, 5.0, "juguetón", "https://cdn.pixabay.com/photo/2016/03/18/10/53/dog-1264667_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("milo", "shiba inu", 3, 6.0, "activo", "https://cdn.pixabay.com/photo/2016/08/14/04/06/shiba-inu-1592018_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("lola", "cavalier king charles spaniel", 4, 5.5, "elegante", "https://cdn.pixabay.com/photo/2016/08/21/22/24/dog-1610937_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("charlie", "schnauzer", 2, 6.5, "juguetón", "https://cdn.pixabay.com/photo/2016/03/05/17/52/rescue-1238145_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("daisy", "bulldog", 3, 4.0, "amistosa", "https://cdn.pixabay.com/photo/2016/06/27/14/35/french-bulldog-1482630_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("rocky", "husky", 1, 8.0, "juguetón", "https://cdn.pixabay.com/photo/2020/01/02/14/01/siberian-husky-4735878_960_720.jpg", "activo"));
        mascotaRepository.save(new Mascota("lily", "pug", 2, 3.5, "dulce", "https://cdn.pixabay.com/photo/2017/06/19/20/32/frank-2420802_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("bella", "labrador", 5, 7.2, "juguetona", "https://cdn.pixabay.com/photo/2023/07/15/08/43/labrador-8128379_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("cooper", "siberian husky", 2, 4.5, "amoroso", "https://cdn.pixabay.com/photo/2019/09/08/05/04/siberian-husky-4460138_960_720.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("luna", "golden doodle", 3, 6.0, "juguetona", "https://cdn.pixabay.com/photo/2015/05/02/21/25/goldendoodle-750443_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("milo", "doberman", 1, 9.0, "vigilante", "https://cdn.pixabay.com/photo/2015/12/18/16/57/dog-1098809_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("zoe", "french bulldog", 4, 4.8, "juguetona", "https://cdn.pixabay.com/photo/2016/12/03/07/45/dog-1879244_960_720.jpg", "activo"));
        mascotaRepository.save(new Mascota("charlie", "shiba inu", 2, 6.5, "activo", "https://cdn.pixabay.com/photo/2022/05/28/07/33/shiba-inu-7226742_1280.jpg", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "beagle", 3, 5.0, "curiosa", "https://cdn.pixabay.com/photo/2018/08/27/21/16/pet-3635985_1280.jpg", "activo"));
        mascotaRepository.save(new Mascota("max", "labrador", 1, 8.0, "juguetón", "https://cdn.pixabay.com/photo/2016/11/19/00/21/dog-1837445_1280.jpg", "inactivo"));

        

        duenoRepository.save(new Dueno("1234", "Juan", "juancito@juancito", "11111"));
        duenoRepository.save(new Dueno("4321", "Pedro", "pedro@pedro", "22222"));
        duenoRepository.save(new Dueno("789", "Maria", "maria@maria", "33333"));
        duenoRepository.save(new Dueno("123", "Juan", "juan@dominio.com", "111111111"));
        duenoRepository.save(new Dueno("124", "Pedro", "pedro@dominio.com", "222222222"));
        duenoRepository.save(new Dueno("125", "Maria", "maria@dominio.com", "333333333"));
        duenoRepository.save(new Dueno("126", "Luis", "luis@dominio.com", "444444444"));
        duenoRepository.save(new Dueno("127", "Ana", "ana@dominio.com", "555555555"));
        duenoRepository.save(new Dueno("128", "Carlos", "carlos@dominio.com", "666666666"));
        duenoRepository.save(new Dueno("129", "Laura", "laura@dominio.com", "777777777"));
        duenoRepository.save(new Dueno("130", "Gabriel", "gabriel@dominio.com", "888888888"));
        duenoRepository.save(new Dueno("131", "Sofia", "sofia@dominio.com", "999999999"));
        duenoRepository.save(new Dueno("132", "Eduardo", "eduardo@dominio.com", "1010101010"));
        duenoRepository.save(new Dueno("133", "Marta", "marta@dominio.com", "1111111111"));
        duenoRepository.save(new Dueno("134", "Roberto", "roberto@dominio.com", "1212121212"));
        duenoRepository.save(new Dueno("135", "Carmen", "carmen@dominio.com", "1313131313"));
        duenoRepository.save(new Dueno("136", "Javier", "javier@dominio.com", "1414141414"));
        duenoRepository.save(new Dueno("137", "Isabel", "isabel@dominio.com", "1515151515"));
        duenoRepository.save(new Dueno("138", "Francisco", "francisco@dominio.com", "1616161616"));
        duenoRepository.save(new Dueno("139", "Elena", "elena@dominio.com", "1717171717"));
        duenoRepository.save(new Dueno("140", "Andres", "andres@dominio.com", "1818181818"));
        duenoRepository.save(new Dueno("141", "Raquel", "raquel@dominio.com", "1919191919"));
        duenoRepository.save(new Dueno("142", "Hector", "hector@dominio.com", "2020202020"));
        duenoRepository.save(new Dueno("143", "Beatriz", "beatriz@dominio.com", "2121212121"));
        duenoRepository.save(new Dueno("144", "Fernando", "fernando@dominio.com", "2222222222"));
        duenoRepository.save(new Dueno("145", "Monica", "monica@dominio.com", "2323232323"));
        duenoRepository.save(new Dueno("146", "Antonio", "antonio@dominio.com", "2424242424"));
        duenoRepository.save(new Dueno("147", "Silvia", "silvia@dominio.com", "2525252525"));
        duenoRepository.save(new Dueno("148", "Ricardo", "ricardo@dominio.com", "2626262626"));
        duenoRepository.save(new Dueno("149", "Natalia", "natalia@dominio.com", "2727272727"));
        duenoRepository.save(new Dueno("150", "Alberto", "alberto@dominio.com", "2828282828"));
        duenoRepository.save(new Dueno("151", "Adriana", "adriana@dominio.com", "2929292929"));
        duenoRepository.save(new Dueno("152", "Julio", "julio@dominio.com", "3030303030"));
        duenoRepository.save(new Dueno("153", "Diana", "diana@dominio.com", "3131313131"));
        duenoRepository.save(new Dueno("154", "Miguel", "miguel@dominio.com", "3232323232"));
        duenoRepository.save(new Dueno("155", "Paola", "paola@dominio.com", "3333333333"));
        duenoRepository.save(new Dueno("156", "Oscar", "oscar@dominio.com", "3434343434"));
        duenoRepository.save(new Dueno("157", "Camila", "camila@dominio.com", "3535353535"));
        duenoRepository.save(new Dueno("158", "Roberto", "roberto@dominio.com", "3636363636"));
        duenoRepository.save(new Dueno("159", "Carolina", "carolina@dominio.com", "3737373737"));
        duenoRepository.save(new Dueno("160", "Juan", "juan@dominio.com", "3838383838"));
        duenoRepository.save(new Dueno("161", "Alicia", "alicia@dominio.com", "3939393939"));
        duenoRepository.save(new Dueno("162", "Erick", "erick@dominio.com", "4040404040"));
        duenoRepository.save(new Dueno("163", "Gabriela", "gabriela@dominio.com", "4141414141"));
        duenoRepository.save(new Dueno("164", "Arturo", "arturo@dominio.com", "4242424242"));
        duenoRepository.save(new Dueno("165", "Rocio", "rocio@dominio.com", "4343434343"));
        duenoRepository.save(new Dueno("166", "Luis", "luis@dominio.com", "4444444444"));
        duenoRepository.save(new Dueno("167", "Paula", "paula@dominio.com", "4545454545"));
        duenoRepository.save(new Dueno("168", "Carlos", "carlos@dominio.com", "4646464646"));
        duenoRepository.save(new Dueno("169", "Sofia", "sofia@dominio.com", "4747474747"));
        duenoRepository.save(new Dueno("170", "Jorge", "jorge@dominio.com", "4848484848"));



        especialidadRepository.save(new Especialidad("Ortopedia"));
        especialidadRepository.save(new Especialidad("Cirugía"));
        especialidadRepository.save(new Especialidad("Oftalmología"));
        especialidadRepository.save(new Especialidad("Dermatologia"));
        especialidadRepository.save(new Especialidad("Odontología"));

        administradorRepository.save(new Administrador("admin", "admin", "admin"));

        drogaRepository.save(new Droga("Amoxicilina", 20000, 25000, 500, 0));
        drogaRepository.save(new Droga("Ibuprofeno", 15000, 20000, 500, 0));
        drogaRepository.save(new Droga("Paracetamol", 10000, 15000, 500, 0));
        drogaRepository.save(new Droga("Aspirina", 5000, 10000, 500, 0));
        drogaRepository.save(new Droga("Clonazepam", 5000, 10000, 500, 0));

        veterinarioRepository.save(new Veterinario("v1", "v1", "veterinario", 1, "carlos", "activo"));
        veterinarioRepository.save(new Veterinario("v2", "v2", "veterinario", 2, "pedro", "activo"));
        veterinarioRepository.save(new Veterinario("v3", "v3", "veterinario", 3, "maria", "activo"));
        veterinarioRepository.save(new Veterinario("v4", "v4", "veterinario", 4, "jose", "activo"));
        veterinarioRepository.save(new Veterinario("v5", "v5", "veterinario", 5, "laura", "activo"));

        tratamientoRepository.save(new Tratamiento(LocalDate.now()));
        tratamientoRepository.save(new Tratamiento("2022-01-01"));
        tratamientoRepository.save(new Tratamiento("2022-02-02"));

        

        List<Dueno> duenos = duenoRepository.findAll();
        List<Mascota> mascotas = mascotaRepository.findAll();

        List<Droga> drogas = drogaRepository.findAll();
        List<Tratamiento> tratamientos = tratamientoRepository.findAll();
        List<Especialidad> especialidades = especialidadRepository.findAll();
        List<Veterinario> veterinarios = veterinarioRepository.findAll();

        Random random = new Random();

        for(Veterinario veterinario : veterinarios){
            int indexEspecialidad = random.nextInt(especialidades.size());
            Especialidad especialidad = especialidades.get(indexEspecialidad);
            
            veterinario.setEspecialidad(especialidad);
            veterinarioRepository.save(veterinario);

        
        }

        
        for (Tratamiento tratamiento : tratamientos) {
            int indexDroga = random.nextInt(drogas.size());
            int indexMascota = random.nextInt(mascotas.size());
            int indexVeterinario = random.nextInt(veterinarios.size());

            Droga droga = drogas.get(indexDroga);
            Mascota mascota = mascotas.get(indexMascota);
            Veterinario veterinario = veterinarios.get(indexVeterinario);

            tratamiento.setDroga(droga);
            tratamiento.setMascota(mascota);
            tratamiento.setVeterinario(veterinario);

            tratamientoRepository.save(tratamiento);

        }

        

        for (Dueno dueno : duenos) {
            int numMascotasAsignadas = 2; // Establecer el número deseado de mascotas por dueño
            List<Mascota> mascotasAsignadas = new ArrayList<>();
        
            for (int i = 0; i < numMascotasAsignadas && mascotas.size() > 0; i++) {
                int indexMascota = random.nextInt(mascotas.size());
                Mascota mascota = mascotas.get(indexMascota);
        
                mascota.setDueno(dueno); // Establecer la relación en la mascota
                mascotasAsignadas.add(mascota);
        
                mascotaRepository.save(mascota); // Guardar la mascota con el nuevo dueño
                mascotas.remove(indexMascota); // Eliminar la mascota de la lista general
            }
        
            dueno.setMascotas(mascotasAsignadas);
            duenoRepository.save(dueno); // Guardar el dueño con las mascotas asignadas
        }


        
        
        
    
    }
}

