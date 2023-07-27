package com.prmentor.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prmentor.demo.repository.ICalendarioRepository;
import com.prmentor.demo.repository.IComentarioRepository;
import com.prmentor.demo.repository.ICursoRepository;
import com.prmentor.demo.repository.IMateriaRepository;
import com.prmentor.demo.repository.IPlanRepository;
import com.prmentor.demo.repository.IRecursoRepository;
import com.prmentor.demo.repository.IReporteRepository;
import com.prmentor.demo.repository.ITutorRepository;
import com.prmentor.demo.repository.IUsuarioRepository;
import com.prmentor.demo.repository.modelo.Calendario;
import com.prmentor.demo.repository.modelo.Comentario;
import com.prmentor.demo.repository.modelo.Materia;
import com.prmentor.demo.repository.modelo.Plan;
import com.prmentor.demo.repository.modelo.Recurso;
import com.prmentor.demo.repository.modelo.Reporte;
import com.prmentor.demo.repository.modelo.Tutor;
import com.prmentor.demo.repository.modelo.Usuario;

@SpringBootApplication
public class PrmentorTaller1Application implements CommandLineRunner {

	@Autowired
	private IUsuarioRepository iUsuarioRepository;

	@Autowired
	private IRecursoRepository iRecursoRepository;

	@Autowired
	private ITutorRepository iTutorRepository;

	@Autowired
	private IComentarioRepository iComentarioRepository;

	@Autowired
	private ICursoRepository iCursoRepository;

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Autowired
	private IPlanRepository iPlanRepository;

	@Autowired
	private IReporteRepository iReporteRepository;

	@Autowired
	private ICalendarioRepository iCalendarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrmentorTaller1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setNombre("Ejemplo Usuario");
		usuario.setCorreo("ejemplo@example.com");
		usuario.setContraseña("contraseña123");
		usuario.setTelefono("123456789");

		Recurso recurso = new Recurso();
		recurso.setTipo("Documento");
		recurso.setNombre("Documento importante");
		recurso.setRuta("/ruta/del/recurso");

		Tutor tutor = new Tutor();
		tutor.setHorarioDisponible("Lunes de 10:00 a 14:00");

		Comentario comentario = new Comentario();
		comentario.setComentario("Excelente servicio, muy recomendado.");
		comentario.setValoracion(5);
		comentario.setFecha(LocalDateTime.now());

		Materia materia = new Materia();
		materia.setDescripcion("jsksnks ");
		materia.setNombre("Matematicas");

		Plan plan = new Plan();
		plan.setFin(LocalDateTime.now());
		plan.setInicio(LocalDateTime.now());

		Reporte reporte = new Reporte();
		reporte.setAsistenciaTutor(1);
		reporte.setFecha(LocalDate.now());
		reporte.setHorarioCumplido(LocalDateTime.now());

		Calendario calendario = new Calendario();
		calendario.setDescripcion("hbdhb");
		calendario.setFecha(LocalDate.now());
		calendario.setFin(LocalDateTime.now());
		calendario.setInicio(LocalDateTime.now());

		this.iUsuarioRepository.insertar(usuario);
		this.iRecursoRepository.insertar(recurso);
		this.iTutorRepository.insertar(tutor);
		this.iComentarioRepository.insertar(comentario);

		this.iMateriaRepository.guardar(materia);
		this.iPlanRepository.guardar(plan);
		this.iReporteRepository.guardar(reporte);
		this.iCalendarioRepository.guardar(calendario);

		System.out.println(this.iUsuarioRepository.buscarPorId(1));
		System.out.println(this.iRecursoRepository.buscarPorId(1));
		System.out.println(this.iTutorRepository.buscarPorId(1));
		System.out.println(this.iComentarioRepository.buscarPorId(1));

		System.out.println(this.iMateriaRepository.buscarPorId(1));
		System.out.println(this.iPlanRepository.buscarPorId(1));
		System.out.println(this.iReporteRepository.buscarPorId(1));
		System.out.println(this.iCalendarioRepository.buscarPorId(1));

	}

}
