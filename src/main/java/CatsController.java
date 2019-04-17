import java.util.ArrayList;
import java.util.List;

public class CatsController implements CatsInterface{

    static List<Cat> cats;

    public CatsController() {
        if (cats == null) {
            cats = new ArrayList<>();
            init();
        }
    }

    public Cat getCat(int id) {
        return cats.get(id);
    }
        public List<Cat> getAllCats() {
        return cats;
    }

        public void addCat(Cat cat) {

        cats.add(cat);
        }


        public void runawayCat(int id) {
            cats.remove(this.getCat(id));
        }
        @Override
        public void updateCat(Cat cat) {
           cats.set(cat.getId(), cat);
        }

    @Override
    public void humanelyEuthanize(Cat cat) {
//        humanelyEuthanize(cat.getId());
    }

    private void init() {
        this.addCat(new Cat("Mace", 3, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6-SYCEReqanb4UWViJEImd845cMt6kFk81Zf2AGkPEUp4VbV4" ));

    }
}
