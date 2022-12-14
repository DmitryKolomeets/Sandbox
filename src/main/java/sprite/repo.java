//package sprite;
//
//public class repo {
//
//    @RestController()
//    @RequestMapping("/animal")
//    public class AnimalController {
//        private final AnimalService animalService;
//
//        @Autowired
//        public AnimalController(AnimalService animalService) {
//            this.animalService = animalService;
//        }
//
//        @GetMapping("/{id}")
//        public Animal getAnimal(@PathVariable int id) {
//            Animal animal = animalService.getAnimal(id);
//            if (animal == null) {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//            }
//            return animal;
//        }
//
//        @PostMapping
//        public Animal updateAnimal(@RequestBody Animal animal) {
//            Animal animal1 = animalService.updateAnimal(animal);
//            if (animal1 == null) {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//            }
//            return animal1;
//        }
//
//        @PutMapping
//        public Animal addAnimal(@RequestBody Animal animal) {
//            return animalService.addAnimal(animal);
//        }
//
//        @DeleteMapping("/{id}")
//        public Animal removeAnimal(@PathVariable int id) {
//            Animal animal = animalService.removeAnimal(id);
//            if (animal == null) {
//                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//            }
//            return animal;
//        }
//    }
//}
