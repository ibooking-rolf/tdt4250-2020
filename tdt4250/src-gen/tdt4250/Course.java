/**
 */
package tdt4250;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.Course#getSemesterType <em>Semester Type</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.Tdt4250Package#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.Tdt4250Package#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(Float)
	 * @see tdt4250.Tdt4250Package#getCourse_Credits()
	 * @model dataType="tdt4250.Credits"
	 * @generated
	 */
	Float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(Float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see tdt4250.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see tdt4250.Tdt4250Package#getCourse_Level()
	 * @model
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see tdt4250.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see tdt4250.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see tdt4250.Tdt4250Package#getCourse_SemesterType()
	 * @model
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see tdt4250.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

} // Course
