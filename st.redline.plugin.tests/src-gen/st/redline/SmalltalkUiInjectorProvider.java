/*
* generated by Xtext
*/
package st.redline;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SmalltalkUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return st.redline.ui.internal.SmalltalkActivator.getInstance().getInjector("st.redline.Smalltalk");
	}
	
}
