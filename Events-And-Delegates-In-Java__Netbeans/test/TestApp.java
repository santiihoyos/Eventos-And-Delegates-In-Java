import model.Person;
import org.junit.Test;

/**
 *
 * @author santiago
 */
public class TestApp extends junit.framework.TestCase {

    @Test
    public void testListener_OkSiSeLLamaAlListenerAsignado() {

        //Given
        Person p1 = new Person("santi", "hoyos", 22);
        ImplementacionDeUnListener listener = new ImplementacionDeUnListener();

        //When execute
        p1.addPersonListener(listener);
        p1.setName("Santiago");
        p1.setLastName("Hoyos");
        p1.setAge(20);

        //Then
        assertTrue(listener.isNombreChanged());
        assertTrue(listener.isApellidoChanged());
        assertTrue(listener.isEdadChanged());

    }

    private class ImplementacionDeUnListener implements Person.PersonListener {

        private boolean nombreChanged = false, edadChanged = false, apellidoChanged = false;

        @Override
        public void onNameChange(Person sender, String newName, String oldName) {
            nombreChanged = true;
        }

        @Override
        public void onLastNameChange(Person sender, String newLastName, String oldLastName) {
            apellidoChanged = true;
        }

        @Override
        public void onAgeChange(Person sender, int newAge, int oldAge) {
            edadChanged = true;
        }

        public boolean isNombreChanged() {
            return nombreChanged;
        }

        public boolean isEdadChanged() {
            return edadChanged;
        }

        public boolean isApellidoChanged() {
            return apellidoChanged;
        }

    }

}
