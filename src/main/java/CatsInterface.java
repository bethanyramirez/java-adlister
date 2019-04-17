import java.util.List;

public interface CatsInterface {

        List<Cat> getAllCats();
        Cat getCat(int id);
        void addCat(Cat cat);
        void updateCat(Cat cat);
        void humanelyEuthanize(Cat cat);


    }

