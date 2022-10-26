import javax.swing.*;
import java.awt.*;



public class Janela extends JFrame {

    private JTextArea tarefaTextArea;
    private JLabel labelTarefa;

    private JLabel labelPrioridade;
    private String[] idades = {"Alta", "Media", "Baixa"};
    private JComboBox priorBox;

    private JCheckBox finalizado;

    private JButton cancelar;
    private JButton salvar;


    public Janela(){
        JFrame frame = new JFrame();
        setTitle("Cadastro de Tarefas");
        setSize(455,330);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setLayout(null);
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);




        labelTarefa = new JLabel("Tarefa");
        tarefaTextArea = new JTextArea(4,6);
        //tarefaTextArea.setSize(200,10);
        tarefaTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tarefaTextArea.setLineWrap(true);



        labelPrioridade = new JLabel("Prioridade");
        priorBox = new JComboBox(idades);


        finalizado = new JCheckBox("Finalizado");


        cancelar = new JButton("Cancelar");

        salvar = new JButton("Salvar");

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(labelTarefa)
                        .addComponent(tarefaTextArea)
                        .addComponent(labelPrioridade)
                        .addComponent(priorBox)
                        .addComponent(finalizado)
                        .addGroup(layout.createParallelGroup()
                            .addComponent(cancelar)
                            .addComponent(salvar))



        );
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addComponent(labelTarefa)
                        .addComponent(tarefaTextArea)
                        .addComponent(labelPrioridade)
                        .addComponent(priorBox)
                        .addComponent(finalizado)
                        .addGroup(layout.createSequentialGroup().addContainerGap(300,300)
                            .addComponent(cancelar)
                            .addComponent(salvar))


        );

        /*panel.add(labelTarefa);
        panel.add(tarefaTextArea);
        panel.add(labelPrioridade);
        panel.add(priorBox);
        panel.add(finalizado);
        panel.add(cancelar);
        panel.add(salvar);*/
        add(panel);

    }

}
