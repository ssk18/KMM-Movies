import SwiftUI
import shared

struct ContentView: View {

	var body: some View {
		Text("greet")
            .onAppear {
                let apiConfig = ApiConfig()
                apiConfig.testApiKey()
            }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
