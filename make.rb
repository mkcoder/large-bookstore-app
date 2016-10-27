class Main
    def initialize(command, options)
        if command == 'mvn-update-version' then
            puts 'mvn-update-version'
        elsif command == 'mvn-use-version' then
            puts 'mvn-latest-version'
        elsif command == 'mvn-next-version' then
            puts 'mvn-next-version'
        elsif command == 'build-and-run' then
          puts 'this build and runs java services only'
          %x{mvn clean install jetty:run}
        elsif command 'start-all' then
          puts 'this runs and start all java services and front-end task'
        end
    end
end

ARGV.each do |a|
    program = Main.new(ARGV[0],ARGV[1])
end