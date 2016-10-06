class Main
    def initialize(command, options)
        if command == 'mvn-update-version' then
            puts 'mvn-update-version'
        elsif command == 'mvn-use-version' then
            puts 'mvn-latest-version'
        elsif command == 'mvn-next-version' then
            puts 'mvn-next-version'
        end
    end
end

ARGV.each do |a|
    program = Main.new(ARGV[0],ARGV[1])
end