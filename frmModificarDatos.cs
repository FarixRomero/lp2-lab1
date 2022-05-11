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
    public partial class frmModificarDatos : Form
    {
        public frmModificarDatos()
        {
            InitializeComponent();
        }

        private void btnModificarContra_Click(object sender, EventArgs e)
        {
            frmModificarContraseña actualizarContraseña = new frmModificarContraseña();
            actualizarContraseña.ShowDialog();
        }

        private void bnCancelar_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        public void limpiarcomponentes() {
            txtContraseña.Text = " ";
            txtEmail.Text = " ";
            txtUsername.Text = " ";
        }
        private void btnConfirmar_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Se ha modificado los datos correctamente", "Mensaje de confirmación", MessageBoxButtons.OK, MessageBoxIcon.Information);
            limpiarcomponentes();
        }

        private void lblTitulo_Click(object sender, EventArgs e)
        {

        }

        private void pModificar_Paint(object sender, PaintEventArgs e)
        {

        }
    }
}
