public class FactoryFactory {


    public Factory getFactory( String str ) {
        if ( str == "Train") {
            return (Factory) new trainFactory();
        }

        else if ( str == "user") {
            return (Factory) new userFactory();
        }
        return null;
    }
};
