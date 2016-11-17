class Main
    def initialize(command, options)
        if command == 'help' then
          puts 'helpful commands'
        elsif command == 'mvn-update-version' then
            puts 'mvn-update-version'
            version = options[/version=([0-9].+)/, 1]
            puts "updating maven version to #{version}"
            puts %x{mvn versions:set "-DnewVersion=#{version}"  -DartifactId=*  -DgroupId=* -DoldVersion=* -DprocessDependencies=false}
        elsif command == 'mvn-use-version' then
            puts 'mvn-latest-version'
        elsif command == 'mvn-next-version' then
            puts 'mvn-next-version'
            puts %x{mvn versions:use-latest-versions -DallowMinorUpdates=false -DexcludeReactor=false -DallowMajorUpdates=false -DallowIncrementalUpdates=false -DallowSnapshots=false}
        elsif command == 'build-and-run' then
          puts 'this build and runs java services only'
          puts %x{mvn clean install jetty:run}
        elsif command 'start-all' then
          puts 'this runs and start all java services and front-end task'
          puts %x{mvn clean install jetty:run}
          puts %x{cd views && npm start}
        end
    end
end

program = Main.new(ARGV[0],ARGV[1])
