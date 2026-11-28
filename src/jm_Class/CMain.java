/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author JMTracks
 */
public class CMain {

    private static void titulo(String texto) {
        System.out.println("\n==================================================");
        System.out.println(" " + texto);
        System.out.println("==================================================");
    }

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 1. PERSONAL: Fisioterapeutas y Recepcionista
        // ---------------------------------------------------------
        titulo("1. PERSONAL (CPersonal -> CFisioterapeuta / CRecepcionista)");

        CFisioterapeuta fisio1 = new CFisioterapeuta(
                "45872136", "Carlos Mendoza Ruiz", 34, "cmendoza", "fisio123",
                "Lunes a Viernes 08:00-14:00", "FIS-001", "Traumatología", 120, 8);

        CFisioterapeuta fisio2 = new CFisioterapeuta(
                "40125896", "Lucía Paredes Torres", 29, "lparedes", "lucia2026",
                "Lunes a Sábado 14:00-20:00", "FIS-002", "Rehabilitación deportiva", 85, 5);

        CRecepcionista recep = new CRecepcionista(
                "72458963", "Rosa Villanueva Díaz", 27, "rvillanueva", "recep456",
                "Lunes a Viernes 08:00-16:00", "REC-001", 0, 0, 0);

        System.out.println(fisio1);
        System.out.println(fisio2);
        System.out.println(recep);

        // ---------------------------------------------------------
        // 2. HORARIOS (composición en CPersonal)
        // ---------------------------------------------------------
        titulo("2. HORARIOS (CHorario)");

        CHorario h1 = new CHorario("HOR-001", DayOfWeek.MONDAY,
                LocalTime.of(8, 0), LocalTime.of(12, 0), fisio1);
        CHorario h2 = new CHorario("HOR-002", DayOfWeek.MONDAY,
                LocalTime.of(11, 0), LocalTime.of(14, 0), fisio1);
        CHorario h3 = new CHorario("HOR-003", DayOfWeek.TUESDAY,
                LocalTime.of(14, 0), LocalTime.of(18, 0), fisio2);
        CHorario h4 = new CHorario("HOR-004", DayOfWeek.WEDNESDAY,
                LocalTime.of(8, 0), LocalTime.of(16, 0), recep);

        fisio1.agregarHorario(h1);
        fisio1.agregarHorario(h2);
        fisio2.agregarHorario(h3);
        recep.agregarHorario(h4);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println("¿H1 y H2 se cruzan? " + h1.seCruza(h2));
        System.out.println("¿H1 y H3 se cruzan? " + h1.seCruza(h3));
        System.out.println("Bloques de " + fisio1.getNombre() + ": " + fisio1.getHorarios().size());

        // ---------------------------------------------------------
        // 3. PACIENTES (CPaciente, CPacienteAsegurado, CPacientePrivado)
        // ---------------------------------------------------------
        titulo("3. PACIENTES (herencia y polimorfismo)");

        CPaciente pac1 = new CPaciente(
                "70123456", "Juan Pérez Soto", 41, "PAC-001",
                "Dolor lumbar crónico", 3, LocalDate.of(2026, 11, 10));

        CPacienteAsegurado pac2 = new CPacienteAsegurado(
                "71234567", "María Gómez Luna", 35, "PAC-002",
                "Lesión de rodilla", 5, LocalDate.of(2026, 11, 15),
                "Rímac Seguros", "POL-998877", 80);

        CPacientePrivado pac3 = new CPacientePrivado(
                "72345678", "Pedro Castillo Vega", 52, "PAC-003",
                "Rehabilitación de hombro", 12, LocalDate.of(2026, 11, 20),
                "20456789123", 15);

        CPaciente[] pacientes = {pac1, pac2, pac3};
        for (CPaciente p : pacientes) {
            System.out.println(p);   // toString polimórfico
            System.out.println("--------------------------------------");
        }

        System.out.println("Copago de " + pac2.getNombre() + " sobre S/.200.00: S/."
                + String.format("%.2f", pac2.calcularCopago(200)));
        System.out.println("Monto de " + pac3.getNombre() + " con descuento sobre S/.200.00: S/."
                + String.format("%.2f", pac3.aplicarDescuento(200)));

        // Asignación de pacientes a fisioterapeutas (agregación)
        fisio1.agregarPaciente(pac1);
        fisio1.agregarPaciente(pac3);
        fisio2.agregarPaciente(pac2);
        System.out.println("\n" + fisio1);
        System.out.println(fisio2);

        // ---------------------------------------------------------
        // 4. HISTORIAL CLÍNICO y SESIONES DE TERAPIA
        // ---------------------------------------------------------
        titulo("4. HISTORIAL CLÍNICO Y SESIONES (CHistorialClinico, CSesionTerapia)");

        CHistorialClinico hist = pac1.getHistorial();   // composición
        hist.setCodigoHistorial("HIS-001");
        hist.setFechaApertura("10/11/2026");
        hist.setDiagnostico("Lumbalgia mecánica");
        hist.setTratamiento("Terapia manual y ejercicios de estabilización");
        hist.agregarObservacion("Paciente refiere dolor al flexionar el tronco");
        hist.agregarObservacion("Mejora progresiva tras la segunda sesión");

        CSesionTerapia ses1 = new CSesionTerapia("SES-001", 45, "Terapia manual",
                "Buena tolerancia al tratamiento", "Lumbalgia mecánica", "10/11/2026", fisio1);
        CSesionTerapia ses2 = new CSesionTerapia("SES-002", 60, "Electroterapia",
                "Disminución del dolor", "Lumbalgia mecánica", "17/11/2026", fisio1);

        hist.agregarSesion(ses1);
        hist.agregarSesion(ses2);
        hist.actualizarDiagnostico("Lumbalgia mecánica en recuperación");
        hist.actualizarTratamiento("Ejercicios de fortalecimiento de core");

        System.out.println(hist);
        ses1.mostrarResumen();
        System.out.println();
        ses2.mostrarResumen();

        // ---------------------------------------------------------
        // 5. CITAS (CCita -> CCitaProgramada / CCitaInmediata)
        // ---------------------------------------------------------
        titulo("5. CITAS (CCita, CCitaProgramada, CCitaInmediata)");

        CCitaProgramada citaProg = new CCitaProgramada(
                "CIT-001", LocalDate.of(2026, 12, 2), LocalDateTime.of(2026, 12, 2, 9, 30),
                "Evaluación inicial", "28/11/2026", pac2, fisio2, "28/11/2026");

        CCitaInmediata citaInm = new CCitaInmediata(
                "CIT-002", LocalDate.of(2026, 11, 28), LocalDateTime.of(2026, 11, 28, 16, 0),
                "Urgencia", "28/11/2026", pac3, fisio1, 1, 25.0);

        CCitaProgramada citaProg2 = new CCitaProgramada(
                "CIT-003", LocalDate.of(2026, 12, 10), LocalDateTime.of(2026, 12, 10, 11, 0),
                "Control", "28/11/2026", pac1, fisio1, "28/11/2026");

        citaProg.setRecordatorioEnviado(true);

        recep.agregarCita(citaProg);
        recep.agregarCita(citaInm);
        recep.agregarCita(citaProg2);
        recep.setCitas_creadas(recep.getCitas().size());

        System.out.println("Estado inicial:");
        System.out.println(citaProg);
        System.out.println(citaInm);
        System.out.println(citaProg2);

        citaInm.confirmarCita();                               // En Reserva -> Completada
        citaProg2.cancelarCita(LocalDate.of(2026, 11, 28));    // antes de la fecha -> Ausente
        citaProg.cancelarCita(LocalDate.of(2026, 12, 5));      // ya pasó la fecha -> no cambia

        System.out.println("\nDespués de confirmar/cancelar:");
        System.out.println(citaProg);
        System.out.println(citaInm);
        System.out.println(citaProg2);

        // ---------------------------------------------------------
        // 6. PRODUCTOS E INVENTARIO
        // ---------------------------------------------------------
        titulo("6. PRODUCTOS E INVENTARIO (CProducto, CInventario)");

        CProductoOrtopedico rodillera = new CProductoOrtopedico(
                "ORT-001", "Rodillera elástica", 45.00, 10, "M", "Neopreno", "Rodilla");
        CProductoOrtopedico faja = new CProductoOrtopedico(
                "ORT-002", "Faja lumbar", 80.00, 4, "L", "Algodón y elastano", "Zona lumbar");
        CInsumoFisioterapia cinta = new CInsumoFisioterapia(
                "INS-001", "Cinta kinesiológica", 12.50, 30, "Cinta adhesiva");
        CInsumoFisioterapia gel = new CInsumoFisioterapia(
                "INS-002", "Gel conductor", 18.00);   // stock 100 y tipo "General"

        CInventario inventario = new CInventario("ALM-001");
        inventario.agregarProducto(rodillera);
        inventario.agregarProducto(faja);
        inventario.agregarProducto(cinta);
        inventario.agregarProducto(gel);

        System.out.println(inventario);
        for (CProducto p : inventario.getProductos()) {
            System.out.println(p);
        }
        System.out.println("\n" + rodillera.mostrarFichaTecnica());
        System.out.println(faja.mostrarFichaTecnica());

        System.out.println("\nAlertas de stock (mínimo " + inventario.getStockMinimoAlerta() + "):");
        for (CProducto p : inventario.getProductos()) {
            if (inventario.verificarAlertaStock(p.getStock())) {
                System.out.println("  ⚠ Stock bajo: " + p.getNombre() + " (" + p.getStock() + ")");
            }
        }

        // ---------------------------------------------------------
        // 7. VENTAS (CVenta) con IGV
        // ---------------------------------------------------------
        titulo("7. VENTAS (CVenta)");

        CVenta venta1 = new CVenta(pac1, faja, 2, "28/11/2026");
        CVenta venta2 = new CVenta(pac2, cinta, 3, "28/11/2026");
        CVenta venta3 = new CVenta(pac3, rodillera, 1, "28/11/2026");

        venta1.mostrarResumen();
        System.out.println();

        CVenta[] ventas = {venta1, venta2, venta3};
        double totalVentas = 0;
        for (CVenta v : ventas) {
            v.getProducto().setStock(v.getProducto().getStock() - v.getCantidad());
            v.setEstado("Pagada");
            recep.agregarVenta(v);
            totalVentas += v.calcularTotal();
            System.out.println(v);
        }
        recep.setVentas_realizadas(recep.getVentas().size());
        System.out.println("Total vendido (con IGV): S/." + String.format("%.2f", totalVentas));

        System.out.println("\nStock tras las ventas:");
        for (CProducto p : inventario.getProductos()) {
            String alerta = inventario.verificarAlertaStock(p.getStock()) ? "  ⚠ ALERTA" : "";
            System.out.println("  " + p.getNombre() + ": " + p.getStock() + alerta);
        }

        // Cobro final de la venta1 según tipo de paciente
        double montoVenta2 = venta2.calcularTotal();
        System.out.println("\nCopago de " + pac2.getNombre() + " por su compra: S/."
                + String.format("%.2f", pac2.calcularCopago(montoVenta2)));
        double montoVenta3 = venta3.calcularTotal();
        System.out.println("Total de " + pac3.getNombre() + " con descuento: S/."
                + String.format("%.2f", pac3.aplicarDescuento(montoVenta3)));

        recep.setReportes_generados(1);
        System.out.println("\n" + recep);

        // ---------------------------------------------------------
        // 8. POLIMORFISMO SOBRE CTransaccion
        // ---------------------------------------------------------
        titulo("8. POLIMORFISMO (CTransaccion)");

        CTransaccion[] transacciones = {ses1, ses2, venta1, venta2, citaProg, citaInm};
        double acumulado = 0;
        for (CTransaccion t : transacciones) {
            t.mostrarResumen();                // cada subclase decide qué mostrar
            acumulado += t.calcularTotal();
            System.out.println("--------------------------------------");
        }
        System.out.println("Suma de totales (calcularTotal polimórfico): S/."
                + String.format("%.2f", acumulado));

        // ---------------------------------------------------------
        // 9. VALIDACIONES (excepciones y mensajes de error)
        // ---------------------------------------------------------
        titulo("9. VALIDACIONES");

        try {
            new CPaciente("123", "Nombre Inválido", 30, "PAC-X", "Prueba", 0, LocalDate.now());
        } catch (IllegalArgumentException e) {
            System.out.println("[DNI] " + e.getMessage());
        }
        try {
            new CPaciente("70000000", "Edad Inválida", 150, "PAC-X", "Prueba", 0, LocalDate.now());
        } catch (IllegalArgumentException e) {
            System.out.println("[Edad] " + e.getMessage());
        }
        try {
            pac1.setN_atenciones(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("[Atenciones] " + e.getMessage());
        }
        try {
            new CPersonal("70000001", "Gerente Falso", 40, "Gerente",
                    "gfalso", "clave123", "Lunes");
        } catch (IllegalArgumentException e) {
            System.out.println("[Rol] " + e.getMessage());
        }
        try {
            new CPersonal("70000002", "Clave Corta", 40, "Recepcionista",
                    "ccorta", "123", "Lunes");
        } catch (IllegalArgumentException e) {
            System.out.println("[Contraseña] " + e.getMessage());
        }
        try {
            new CHorario("HOR-999", DayOfWeek.FRIDAY,
                    LocalTime.of(15, 0), LocalTime.of(10, 0), fisio1);
        } catch (IllegalArgumentException e) {
            System.out.println("[Horario] " + e.getMessage());
        }
        try {
            new CHorario("HOR-998", DayOfWeek.FRIDAY,
                    LocalTime.of(8, 0), LocalTime.of(10, 0), new CPersonal());
        } catch (IllegalArgumentException e) {
            System.out.println("[Horario/Rol] " + e.getMessage());
        }
        try {
            hist.setFechaApertura("31/02/2026");
        } catch (IllegalArgumentException e) {
            System.out.println("[Historial] " + e.getMessage());
        }
        try {
            inventario.agregarProducto(null);
        } catch (IllegalArgumentException e) {
            System.out.println("[Inventario] " + e.getMessage());
        }
        try {
            fisio1.agregarPaciente(null);
        } catch (IllegalArgumentException e) {
            System.out.println("[Fisioterapeuta] " + e.getMessage());
        }
        try {
            new CProducto("PRO-X", "Producto Negativo", -10, 5, "General");
        } catch (IllegalArgumentException e) {
            System.out.println("[Producto] " + e.getMessage());
        }

        System.out.println("\nVenta con cantidad inválida:");
        CVenta ventaCantidad = new CVenta(pac1, gel, 0, "28/11/2026");
        System.out.println(ventaCantidad);

        System.out.println("\nInsumo con tipo vacío:");
        CInsumoFisioterapia insumoVacio = new CInsumoFisioterapia("INS-003", "Venda", 8.0, 20, "");
        System.out.println(insumoVacio);
        titulo("10. CONTADORES ESTÁTICOS");
        System.out.println("Total de pacientes creados (CPaciente): " + CPaciente.getTotal_pacientes());
        System.out.println("Total de personas creadas (CPersona): " + CPersona.getCnt());

        System.out.println("\n>>> Fin del programa <<<");
    }
}

