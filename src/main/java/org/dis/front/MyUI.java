package org.dis.front;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;
import org.dis.back.Usuario;

import java.util.Arrays;
import java.util.List;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        TabSheet tabSheet = new TabSheet();

        /* ==== Estructura tab Usuarios ==== */

        final VerticalLayout layoutUsuariosContainer = new VerticalLayout();
        final HorizontalLayout layoutUsuarios = new HorizontalLayout();

        Button botonUsuario = new Button("Usuarios");
        botonUsuario.addClickListener(e -> {
            layout.addComponent(new Label("El boton Usuarios funciona!"));
        });

        /* ==== Añadir un grid con los datos de los usuarios ==== */
        Grid<Usuario> gridUsuarios = new Grid<>();
        
        gridUsuarios.setCaption("Usuarios");
        gridUsuarios.setSizeFull();
        gridUsuarios.addColumn(Usuario::getIdUsuario).setCaption("IdUsuario");
        gridUsuarios.addColumn(Usuario::getNombreUsuario).setCaption("NombreUsuario");
        gridUsuarios.addColumn(Usuario::getCorreoUsuario).setCaption("CorreoUsuario");
        gridUsuarios.addColumn(Usuario::getDepartamentoUsuario).setCaption("DepartamentoUsuario");
        gridUsuarios.addColumn(Usuario::getUbicacionUsuario).setCaption("UbicacionUsuario");
        gridUsuarios.addColumn(Usuario::getTelefonoUsuario).setCaption("TelefonoUsuario");

        List<Usuario> usuarios = Arrays.asList(
                new Usuario("1", "Nombre1", "Correo1", "Departamento1", "Ubicacion1", "Telefono1"));

        /* ==== Estructura tab Equipos ==== */

        final VerticalLayout layoutEquiposContainer = new VerticalLayout();
        final HorizontalLayout layoutEquipos = new HorizontalLayout();

        /* ==== Estructura tab Prestamos ==== */

        final VerticalLayout layoutPrestamosContainer = new VerticalLayout();
        final HorizontalLayout layoutPrestamos = new HorizontalLayout();

        layoutUsuariosContainer.addComponent(gridUsuarios);



        tabSheet.addTab(layoutUsuariosContainer, "Usuarios");
        tabSheet.addTab(layoutEquiposContainer, "Equipos");
        tabSheet.addTab(layoutPrestamosContainer, "Prestamos");

        layout.addComponent(tabSheet);
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {

    }
}
