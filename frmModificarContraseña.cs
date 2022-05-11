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
    public partial class frmModificarContraseña : Form
    {
        public frmModificarContraseña()
        {
            InitializeComponent();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            DialogResult respuesta = MessageBox.Show("¿Está seguro que deseas dejar inconclusa esta tarea?",
                "Mensaje de Confirmación", MessageBoxButtons.YesNo,
                MessageBoxIcon.Question);
            if (respuesta == DialogResult.Yes)
            {
                this.Close();
            }
        }

        private void btnConfirmar_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Se ha modificado la contraseña correctamente", "Mensaje de confirmación", MessageBoxButtons.OK, MessageBoxIcon.Information);
            this.Close();
        }
    }
}
