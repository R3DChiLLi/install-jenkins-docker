import jenkins.model.Jenkins

println("Setting CSP Policy...")
System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "sandbox allow-scripts;")
println("CSP Policy Set Successfully")

