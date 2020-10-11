/**
 */
package tdt4250;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.University#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.University#getProgrammes <em>Programmes</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.Tdt4250Package#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' reference list.
	 * @see tdt4250.Tdt4250Package#getUniversity_Programmes()
	 * @model
	 * @generated
	 */
	EList<Programme> getProgrammes();

} // University
