using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LP2Clinica
{
    public partial class frmRegistro : Form
    {
        public frmRegistro()
        {
            InitializeComponent();
        }


        private void btnSiguiente_Click(object sender, EventArgs e)
        {
            if (rbAdministrador.Checked)
            {
                frmRegistroAdministrador registro = new frmRegistroAdministrador();
                registro.Show();
                this.Close(); // OJO CON EL CLOSE PA QUE NO SE PIERDA LA DATA ANTERIOR
            }
            else if (rbMedico.Checked)
            {
                frmRegistroMedico registro = new frmRegistroMedico();
                //registro.retonardata(new medico);
                registro.Show();
                this.Close(); // OJO CON EL CLOSE PA QUE NO SE PIERDA LA DATA ANTERIOR
            }
            else if (rbPaciente.Checked)
            {
                frmRegistroPaciente registro = new frmRegistroPaciente();
                registro.Show();
                this.Close(); // OJO CON EL CLOSE PA QUE NO SE PIERDA LA DATA ANTERIOR

            }
            else {
                MessageBox.Show("Señale el tipo de usuario", "Mensaje de recordatorio", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            
        }

        private void bnCancelar_Click(object sender, EventArgs e)
        {
            Inicio comienzo = new Inicio();
            comienzo.Show();
            this.Close();
        }
    }
}
