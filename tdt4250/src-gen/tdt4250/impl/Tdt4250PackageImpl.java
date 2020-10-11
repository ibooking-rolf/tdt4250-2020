/**
 */
package tdt4250.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdt4250.Course;
import tdt4250.CourseLevel;
import tdt4250.ElectiveCourseGroup;
import tdt4250.MandatoryCourseGroup;
import tdt4250.Programme;
import tdt4250.ProgrammeLevel;
import tdt4250.Semester;
import tdt4250.SemesterType;
import tdt4250.Specialization;
import tdt4250.Tdt4250Factory;
import tdt4250.Tdt4250Package;

import tdt4250.University;
import tdt4250.util.Tdt4250Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tdt4250PackageImpl extends EPackageImpl implements Tdt4250Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryCourseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electiveCourseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programmeLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType creditsEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdt4250.Tdt4250Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tdt4250PackageImpl() {
		super(eNS_URI, Tdt4250Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Tdt4250Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tdt4250Package init() {
		if (isInited)
			return (Tdt4250Package) EPackage.Registry.INSTANCE.getEPackage(Tdt4250Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTdt4250Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Tdt4250PackageImpl theTdt4250Package = registeredTdt4250Package instanceof Tdt4250PackageImpl
				? (Tdt4250PackageImpl) registeredTdt4250Package
				: new Tdt4250PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTdt4250Package.createPackageContents();

		// Initialize created meta-data
		theTdt4250Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTdt4250Package, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Tdt4250Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTdt4250Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tdt4250Package.eNS_URI, theTdt4250Package);
		return theTdt4250Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversity_Name() {
		return (EAttribute) universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Programmes() {
		return (EReference) universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Level() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_SemesterType() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMandatoryCourseGroup() {
		return mandatoryCourseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMandatoryCourseGroup_Courses() {
		return (EReference) mandatoryCourseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMandatoryCourseGroup_Programme() {
		return (EReference) mandatoryCourseGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElectiveCourseGroup() {
		return electiveCourseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElectiveCourseGroup_Courses() {
		return (EReference) electiveCourseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElectiveCourseGroup_Programme() {
		return (EReference) electiveCourseGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Name() {
		return (EAttribute) programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Duration() {
		return (EAttribute) programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Semesters() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Specialization() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_MandatoryCourses() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_ElectiveCourseGroup() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProgramme__GetCredits() {
		return programmeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_Season() {
		return (EAttribute) semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_Programme() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_Courses() {
		return (EReference) semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialization_Name() {
		return (EAttribute) specializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_Programme() {
		return (EReference) specializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_SelectableIn() {
		return (EReference) specializationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCourseLevel() {
		return courseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemesterType() {
		return semesterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProgrammeLevel() {
		return programmeLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCredits() {
		return creditsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tdt4250Factory getTdt4250Factory() {
		return (Tdt4250Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		universityEClass = createEClass(UNIVERSITY);
		createEAttribute(universityEClass, UNIVERSITY__NAME);
		createEReference(universityEClass, UNIVERSITY__PROGRAMMES);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEAttribute(courseEClass, COURSE__SEMESTER_TYPE);

		mandatoryCourseGroupEClass = createEClass(MANDATORY_COURSE_GROUP);
		createEReference(mandatoryCourseGroupEClass, MANDATORY_COURSE_GROUP__COURSES);
		createEReference(mandatoryCourseGroupEClass, MANDATORY_COURSE_GROUP__PROGRAMME);

		electiveCourseGroupEClass = createEClass(ELECTIVE_COURSE_GROUP);
		createEReference(electiveCourseGroupEClass, ELECTIVE_COURSE_GROUP__COURSES);
		createEReference(electiveCourseGroupEClass, ELECTIVE_COURSE_GROUP__PROGRAMME);

		programmeEClass = createEClass(PROGRAMME);
		createEAttribute(programmeEClass, PROGRAMME__NAME);
		createEAttribute(programmeEClass, PROGRAMME__DURATION);
		createEReference(programmeEClass, PROGRAMME__SEMESTERS);
		createEReference(programmeEClass, PROGRAMME__SPECIALIZATION);
		createEReference(programmeEClass, PROGRAMME__MANDATORY_COURSES);
		createEReference(programmeEClass, PROGRAMME__ELECTIVE_COURSE_GROUP);
		createEOperation(programmeEClass, PROGRAMME___GET_CREDITS);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__SEASON);
		createEReference(semesterEClass, SEMESTER__PROGRAMME);
		createEReference(semesterEClass, SEMESTER__COURSES);

		specializationEClass = createEClass(SPECIALIZATION);
		createEAttribute(specializationEClass, SPECIALIZATION__NAME);
		createEReference(specializationEClass, SPECIALIZATION__PROGRAMME);
		createEReference(specializationEClass, SPECIALIZATION__SELECTABLE_IN);

		// Create enums
		courseLevelEEnum = createEEnum(COURSE_LEVEL);
		semesterTypeEEnum = createEEnum(SEMESTER_TYPE);
		programmeLevelEEnum = createEEnum(PROGRAMME_LEVEL);

		// Create data types
		creditsEDataType = createEDataType(CREDITS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversity_Name(), ecorePackage.getEString(), "name", null, 0, 1, University.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Programmes(), this.getProgramme(), null, "programmes", null, 0, -1,
				University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), this.getCredits(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), this.getCourseLevel(), "level", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_SemesterType(), this.getSemesterType(), "semesterType", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryCourseGroupEClass, MandatoryCourseGroup.class, "MandatoryCourseGroup", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMandatoryCourseGroup_Courses(), this.getCourse(), null, "courses", null, 0, -1,
				MandatoryCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMandatoryCourseGroup_Programme(), this.getProgramme(), this.getProgramme_MandatoryCourses(),
				"programme", null, 0, 1, MandatoryCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electiveCourseGroupEClass, ElectiveCourseGroup.class, "ElectiveCourseGroup", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElectiveCourseGroup_Courses(), this.getCourse(), null, "courses", null, 0, -1,
				ElectiveCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectiveCourseGroup_Programme(), this.getProgramme(), this.getProgramme_ElectiveCourseGroup(),
				"programme", null, 0, 1, ElectiveCourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_Duration(), this.getProgrammeLevel(), "duration", null, 0, 1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Semesters(), this.getSemester(), this.getSemester_Programme(), "semesters", null, 0,
				-1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Specialization(), this.getSpecialization(), this.getSpecialization_Programme(),
				"specialization", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_MandatoryCourses(), this.getMandatoryCourseGroup(),
				this.getMandatoryCourseGroup_Programme(), "mandatoryCourses", null, 0, 1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_ElectiveCourseGroup(), this.getElectiveCourseGroup(),
				this.getElectiveCourseGroup_Programme(), "electiveCourseGroup", null, 0, 1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProgramme__GetCredits(), ecorePackage.getEFloat(), "getCredits", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_Season(), this.getSemesterType(), "season", null, 0, 1, Semester.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_Programme(), this.getProgramme(), this.getProgramme_Semesters(), "programme", null,
				0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_Courses(), this.getCourse(), null, "courses", null, 0, -1, Semester.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specialization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_Programme(), this.getProgramme(), this.getProgramme_Specialization(),
				"programme", null, 0, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_SelectableIn(), this.getSemester(), null, "selectableIn", null, 0, 1,
				Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(courseLevelEEnum, CourseLevel.class, "CourseLevel");
		addEEnumLiteral(courseLevelEEnum, CourseLevel.FOUNDATION_COURSE);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.INTERMEDIATE_COURSE);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.THIRD_YEAR_COURSE);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.HIGHER_LEVEL_COURSE);

		initEEnum(semesterTypeEEnum, SemesterType.class, "SemesterType");
		addEEnumLiteral(semesterTypeEEnum, SemesterType.FALL);
		addEEnumLiteral(semesterTypeEEnum, SemesterType.SPRING);
		addEEnumLiteral(semesterTypeEEnum, SemesterType.BOTH);

		initEEnum(programmeLevelEEnum, ProgrammeLevel.class, "ProgrammeLevel");
		addEEnumLiteral(programmeLevelEEnum, ProgrammeLevel.BACHELOR);
		addEEnumLiteral(programmeLevelEEnum, ProgrammeLevel.MASTER);
		addEEnumLiteral(programmeLevelEEnum, ProgrammeLevel.INTEGRATED_MASTER);

		// Initialize data types
		initEDataType(creditsEDataType, Float.class, "Credits", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(programmeEClass, source,
				new String[] { "constraints", "needsEnoughCredits needsEnoughSemesters" });
		addAnnotation(semesterEClass, source, new String[] { "constraints", "needsEnoughCredits" });
		addAnnotation(creditsEDataType, source, new String[] { "constraints", "cannotBeNegative" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation(semesterEClass, source,
				new String[] { "needsEnoughCredits",
						"self.courses->collect(course | course.credtis).forAll(sum | sum == 30f)" },
				new URI[] { URI.createURI(eNS_URI)
						.appendFragment("//Semester/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0") });
		addAnnotation(creditsEDataType, source, new String[] { "constraints", "self.credits >= 0" },
				new URI[] { URI.createURI(eNS_URI)
						.appendFragment("//Credits/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0") });
	}

} //Tdt4250PackageImpl
